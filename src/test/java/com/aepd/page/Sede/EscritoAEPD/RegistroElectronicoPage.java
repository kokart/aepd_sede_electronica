package com.aepd.page.Sede.EscritoAEPD;

import com.aepd.page.BasePage;
import com.aepd.page.Sede.comun.AftSedeTest;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistroElectronicoPage extends BasePage {

    public RegistroElectronicoPage(WebDriver driver) {
        super(driver);
    }
    public static void introducirValoresNotificacionPostal() {
        datosSolicitanteNotificacionPostalCalle();
        datosSolicitanteNotificacionPostalNumero();
        datosSolicitanteNotificacionPostalPortalEscaleraPisoPuerta();
        datosSolicitanteNotificacionPostalCodigoPostal();
        datosSolicitanteNotificacionPostalProvincia();
        datosSolicitanteNotificacionPostalLocalidad();
        datosSolicitanteClickSiguiente();
    }

    public static void datosSolicitanteClickSiguiente() {
        $(By.id("identificacionSolicitante:enviarDatos")).click();
    }

    public static void datosSolicitanteNotificacionPostalLocalidad() {
        $(By.id("identificacionSolicitante:localidad_input")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalLocalidad);
        sleep(1000);
        $(By.xpath("//*[@id='identificacionSolicitante:localidad_panel']/ul/li")).click();
        sleep(1000);
    }

    public static void datosSolicitanteNotificacionPostalProvincia() {
        $(By.id("identificacionSolicitante:provinciaSelect")).selectOptionByValue(AftSedeTest.REDatosSolicitanteNotificacionPostalProvincia);
    }

    public static void datosSolicitanteNotificacionPostalCodigoPostal() {
        $(By.id("identificacionSolicitante:codigoPostal")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalCodigoPostal);
    }

    public static void datosSolicitanteNotificacionPostalPortalEscaleraPisoPuerta() {
        $(By.id("identificacionSolicitante:portal")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalPortal);
        $(By.id("identificacionSolicitante:escalera")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalEscalera);
        $(By.id("identificacionSolicitante:piso")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalPiso);
        $(By.id("identificacionSolicitante:puerta")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalPuerta);
    }

    public static void datosSolicitanteNotificacionPostalNumero() {
        $(By.id("identificacionSolicitante:numero")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalNumero);
    }

    public static void datosSolicitanteNotificacionPostalCalle() {
        $(By.id("identificacionSolicitante:calle")).val(AftSedeTest.REDatosSolicitanteNotificacionPostalCalle);
    }


    public static void escribirDatosEntrada() {
        datosEntradaDescripcion();
        datosEntradaClickSiguiente();
    }

    public static void datosEntradaClickSiguiente() {
        $(By.id("formularioProcedimientoEntrada:enviarDatos")).click();
    }

    public static void datosEntradaDescripcion() {
        $(By.id("formularioProcedimientoEntrada:consulta")).val(AftSedeTest.REDatosEntradaDescripcion);
    }





    public static void clickObtenerJustificante() {
        //sleep(35000);
        $(By.id("formDescargaPDF:botonJustificante")).shouldBe(visible, Duration.ofSeconds(40));
        $(By.id("formDescargaPDF:botonJustificante")).click();

        //$(By.id("formDescargaPDF:botonJustificante")).click();
        sleep(1000);
    }


    public static void comprobarJustificante() throws IOException {
        //Leemos el PDF descargado y  buscamos el patrón indicado.
        File dir = new File(AftSedeTest.downloadsFolderPath);
        List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        for (File file : files) {
            File justificantePDF = new File(file.getCanonicalPath());
            PDDocument document = PDDocument.load(justificantePDF);
            PDFTextStripper pdfStripper = new PDFTextStripper();

            //Obtenemos el texto del documento PDF
            String text = pdfStripper.getText(document);
           // System.out.println(text);
            //Validar cadena texto
            //Assert.assertTrue("Texto no encontrado", text.toUpperCase().contains("ADJUNTO PRUEBA"));      //assertThat(text, containsText("ADJUNTO PRUEBA"));
            //Cerramos documento
            document.close();
        }
        //Borramos el directorio para que esté limpio la siguiente ejecución del test
        FileUtils.deleteDirectory(new File(AftSedeTest.downloadsFolderPath));
    }


    public static void introducirValoresNombrePropioConNotificacionPostal() {
        aceptarPopupAvisoNotificacionesElectronicas();
        datosSolicitanteTelefono();
        datosSolicitanteCorreoElectronico();

        datosSolicitanteClickNotificacionPostal();
        datosSolicitantePaisEspaña();
        datosSolicitanteNotificacionPostalCalle();
        datosSolicitanteNotificacionPostalNumero();
        datosSolicitanteNotificacionPostalPortalEscaleraPisoPuerta();
        datosSolicitanteNotificacionPostalCodigoPostal();
        datosSolicitanteNotificacionPostalProvincia();
        datosSolicitanteNotificacionPostalLocalidad();
        datosSolicitanteClickSiguiente();
     }

    public static void datosSolicitantePaisEspaña() {
        $(By.id("identificacionSolicitante:pais")).selectOptionByValue("ES");
    }

    public static void datosSolicitanteClickNotificacionPostal() {
        $(By.id("identificacionSolicitante:medioNotificacion:0")).click();
    }

    public static void datosSolicitanteCorreoElectronico() {
        $(By.id("identificacionSolicitante:inputCorreoElect")).val(AftSedeTest.REDatosSolicitanteCorrerElectronico);
    }

    public static void aceptarPopupAvisoNotificacionesElectronicas() {
                  if ($(By.cssSelector("#tinycontent .boton")).exists()) {
                      $(By.cssSelector("#tinycontent .boton")).click();
                  }
    }

    public static void introducirValoresNombrePropioConNotificacion(String tipoNotificacion) {
        aceptarPopupAvisoNotificacionesElectronicas();
        datosSolicitanteTelefono();
        datosSolicitanteCorreoElectronico();
        if (tipoNotificacion.equals("postal")) {
            datosSolicitanteClickNotificacionPostal();
            datosSolicitantePaisEspaña();
            datosSolicitanteNotificacionPostalCalle();
            datosSolicitanteNotificacionPostalNumero();
            datosSolicitanteNotificacionPostalPortalEscaleraPisoPuerta();
            datosSolicitanteNotificacionPostalCodigoPostal();
            datosSolicitanteNotificacionPostalProvincia();
            datosSolicitanteNotificacionPostalLocalidad();
            sleep(1000);
        }
        datosSolicitanteClickSiguiente();


    }

    public  static void introducirValoresRepresentanteYPersonaConNotificacion(String tipoPersona, String nacionalidad, String tipoNotificacion) {
        aceptarPopupAvisoNotificacionesElectronicas();

        datosSolicitanteSoySuRepresentante();
        datosRepresentanteTelefono();
        datosRepresentanteCorreoElectronico();

        //Rellenamos datos interesado si es persona fisica o juridica
        if (tipoPersona.equals("fisica") && nacionalidad.equals("española")) {
            datosSolicitanteInteresadoPersonaFisicaNombreResponsable();
            datosSolicitanteInteresadoPersonaFisicaPrimerApellido();
            datosSolicitanteInteresadoPersonaFisicaSegundoApellido();
            datosSolicitanteInteresadoPersonaFisicaTipoDoc("2");
            datosSolicitanteInteresadoPersonaFisicaDocumentoIdentificativo();
            datosSolicitanteTelefono();
            datosSolicitantePersonaFiyJuCorreoElectronico();
          } else if (tipoPersona.equals("fisica") && nacionalidad.equals("no española")) {
            datosSolicitanteClickInteresadoNoEspanyol();
            datosSolicitanteInteresadoPersonaFisicaNombreResponsable();
            datosSolicitanteInteresadoPersonaFisicaPrimerApellido();
            datosSolicitanteInteresadoPersonaFisicaTipoDoc("1");
            datosSolicitantePersonaFisicaPasaporte();
        } else if (tipoPersona.equals("juridica") && nacionalidad.equals("española")) {
            datosSolicitanteClickPersonaJuridica();
            datosSolicitantePersonaJuridicaRazonSOcial();
            datosSolicitantePersonaJuridicaNIF();
            datosSolicitantePersonaFiyJuCorreoElectronico();

        } else {
            datosSolicitanteClickPersonaJuridica();

            datosSolicitanteClickInteresadoNoEspanyol();
            datosSolicitantePersonaJuridicaRazonSOcial();
        }

        //Combinaciones tipo persona y tipo notificaciones y nacionalidad
        if (tipoPersona.equals("fisica") && tipoNotificacion.equals("postal") && nacionalidad.equals("española")) {
            datosSolicitanteClickNotificacionPostal();
            datosSolicitanteNotificacionPostalCalle();
            datosSolicitanteNotificacionPostalNumero();
            datosSolicitanteNotificacionPostalPortalEscaleraPisoPuerta();
            datosSolicitantePaisEspaña();
            sleep(1000);
            datosSolicitanteNotificacionPostalCodigoPostal();
            datosSolicitanteNotificacionPostalProvincia();
            datosSolicitanteNotificacionPostalLocalidad();
            sleep(1000);
            clickEnviarDatosSolicitante();
        } else if (tipoPersona.equals("fisica") && tipoNotificacion.equals("postal") && nacionalidad.equals("no española")) {
            datosSolicitanteClickInteresadoNoEspanyol();
            datosSolicitanteClickNotificacionPostal();
            datosSolicitanteNotificacionPostalCalle();
            datosSolicitanteNotificacionPostalNumero();
            datosSolicitanteNotificacionPostalPortalEscaleraPisoPuerta();
            datosSolicitanteNotificacionPostalPaisyLocalidadExtranjera();
            clickEnviarDatosSolicitante();
        } else if (tipoPersona.equals("fisica") && tipoNotificacion.equals("electronica") && nacionalidad.equals("española")) {
            clickEnviarDatosSolicitante();

        } else if (tipoPersona.equals("fisica") && tipoNotificacion.equals("electronica") && nacionalidad.equals("no española")) {
            $(By.id("identificacionSolicitante:medioNotificacion:1")).shouldBe(disabled);



        } else if (tipoPersona.equals("juridica") && tipoNotificacion.equals("postal") && nacionalidad.equals("española")) {
            $(By.id("identificacionSolicitante:medioNotificacion:0")).shouldBe(disabled);

        } else if (tipoPersona.equals("juridica") && tipoNotificacion.equals("postal") && nacionalidad.equals("no española")) {
            datosSolicitanteNotificacionPostalCalle();
            datosSolicitanteNotificacionPostalNumero();
            datosSolicitanteNotificacionPostalPortalEscaleraPisoPuerta();
            datosSolicitanteNotificacionPostalPaisyLocalidadExtranjera();
            clickEnviarDatosSolicitante();

        } else if (tipoPersona.equals("juridica") && tipoNotificacion.equals("electronica") && nacionalidad.equals("española")) {
            clickEnviarDatosSolicitante();
        } else {//juridica, electronica y no española
            $(By.id("identificacionSolicitante:medioNotificacion:1")).shouldBe(disabled);
        }
    }

    public static void datosSolicitantePersonaFiyJuCorreoElectronico() {
        $(By.id("identificacionSolicitante:inputCorreoElectSoli")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaFisicaYJuridicaCorreoElectronico);

    }



    public static void datosSolicitantePersonaJuridicaNIF() {
        $(By.id("identificacionSolicitante:cifRespEmpresa")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaJuridicaNIF);

    }

    public static void datosSolicitantePersonaJuridicaRazonSOcial() {
        $(By.id("identificacionSolicitante:razonSocialResponsable")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaJuridicaRazonSocial);

    }

    public static void datosSolicitanteClickPersonaJuridica() {
        $(By.id("identificacionSolicitante:tipoResponsable:1")).click();
    }

    public static void datosSolicitanteClickInteresadoNoEspanyol() {
        $(By.id("identificacionSolicitante:interesadoNoEsp")).click();
    }

    public static void datosSolicitantePersonaFisicaPasaporte() {
        $(By.id("identificacionSolicitante:nifNieSoli")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaFisicaPasasporte);
    }

    public static void datosSolicitanteNotificacionPostalPaisyLocalidadExtranjera() {
        $(By.id("identificacionSolicitante:pais")).selectOptionByValue("AD");
        $(By.id("identificacionSolicitante:localidad_input")).val("ANDORRA LA VELLA");
    }

    public static void datosSolicitanteInteresadoPersonaFisicaDocumentoIdentificativo() {
        $(By.id("identificacionSolicitante:nifNieSoli")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaFisicaDocumentoIdentificativo);
    }

    public static void datosSolicitanteInteresadoPersonaFisicaTipoDoc(String tipoDocumento) {
        $(By.id("identificacionSolicitante:tipoDocSoli")).selectOptionByValue(tipoDocumento);
    }

    public static void datosSolicitanteInteresadoPersonaFisicaSegundoApellido() {
        $(By.id("identificacionSolicitante:segundoApellidoResponsable")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaFisicaSegundoApellido);
    }

    public static void datosSolicitanteInteresadoPersonaFisicaPrimerApellido() {
        $(By.id("identificacionSolicitante:primerApellidoResponsable")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaFisicaPrimerApellido);
    }

    public static void datosRepresentanteCorreoElectronico() {

        $(By.id("identificacionSolicitante:inputCorreoElect")).val(AftSedeTest.REDatosRepresenanteCorreoElectronico);
    }

    public static void datosRepresentanteTelefono() {
        $(By.id("identificacionSolicitante:telefono")).val(AftSedeTest.REDatosRepresenanteTelefono);
    }

    public static void datosSolicitanteInteresadoPersonaFisicaNombreResponsable() {
        $(By.id("identificacionSolicitante:nombreResponsable")).val(AftSedeTest.REDatosSolicitanteInteresadoPersonaFisicaNombre);
    }

    public static void datosSolicitanteSoySuRepresentante() {
        $(By.id("identificacionSolicitante:opcionReclamante:1")).click();
    }

    public static void clickEnviarDatosSolicitante() {
        $(By.id("identificacionSolicitante:enviarDatos")).click();
        aceptarPopupAvisoNotificacionesElectronicas();
    }

    public static void introducirDatosDelSolicitante(String notificacion) {
        datosSolicitanteTelefono();
        datosSolicitanteCorreoElectronico();
        if(notificacion.equals("postal")) {
            introducirValoresNotificacionPostal();
        }else{
            datosSolicitanteClickNotificacionElectronica();
            aceptarPopupAvisoNotificacionesElectronicas();
            datosSolicitanteClickSiguiente();
        }
    }

    public static void datosSolicitanteClickNotificacionElectronica() {
        $(By.id("identificacionSolicitante:medioNotificacion:1")).click();
    }

    public static void datosSolicitanteTelefono() {
        $(By.id("identificacionSolicitante:telefono")).val(AftSedeTest.REDatosSolicitanteTelefono);
    }
    public static void datosSolicitanteTelefonoInteresado() {
        $(By.id("identificacionSolicitante:telefonoSoli")).val(AftSedeTest.REDatosSolicitanteTelefonoInteresado);
    }


}