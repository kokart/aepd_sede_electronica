package com.example.aiotestpoc.page.Sede.QuejasYSugerencias;


import com.codeborne.selenide.Configuration;
import com.example.aiotestpoc.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.example.aiotestpoc.page.Sede.comun.AftSedeTest;

import java.io.IOException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.example.aiotestpoc.page.Sede.EscritoAEPD.RegistroElectronicoStepDefinitions.*;
import static com.example.aiotestpoc.page.Sede.EscritoAEPD.RegistroElectronicoStepDefinitions.datosSolicitanteClickNotificacionElectronica;
import static java.util.concurrent.TimeUnit.SECONDS;

public class QuejasYSugerenciasPage extends BasePage {


    public QuejasYSugerenciasPage(WebDriver driver) {
        super(driver);
    }

    public void openConsultasAEPD() throws IOException {

        ChromeOptions options = new ChromeOptions();
        Configuration.browserSize = "1920x1080";
        options.addArguments("--remote-allow-origins=*");
        Configuration.browserCapabilities = options;
        open("https://sede-cer-vdc-1.agpd.local/sede-electronica-web/vistas/infoSede/quejasSugerencias.jsf");
        getWebDriver().manage().timeouts().pageLoadTimeout(80, SECONDS);
        refresh();
    }



    public void introducirSugerencia() {
          $(By.id("formularioQuejas:motivo")).val(AftSedeTest.REDatosEntradaDescripcion);
        $(By.id("formularioQuejas:enviarDatos")).click();
    }

    public void introducirQueja() {
        $(By.id("formularioQuejas:unidad")).selectOptionByValue("LOC1000000000008");
        $(By.id("formularioQuejas:fecha_input")).val("01/01/2023");
       // $(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[7]/a")).click();
        $(By.id("formularioQuejas:motivo")).val(AftSedeTest.REDatosEntradaDescripcion);
        $(By.id("formularioQuejas:enviarDatos")).click();
    }


    public void clickContinuarQuejaYSugerencia() {

        $(By.xpath("//*[@id='formQueja']/div/input")).click();
    }

    public void clickSugerencia() {
        $(By.xpath("//*[@id='solicitaClaveForm']/div[1]/input")).click();

    }

    public void clickQueja() {
        $(By.xpath("//*[@id='solicitaClaveForm:sinCertificado']")).click();

    }


    public void clickElectronico() {
        $(By.id("solicitaClaveForm:sinCertificado")).click();
        if ($(byText("Accept all")).isDisplayed()) {
            $(byText("Accept all")).shouldBe(visible).click();
            $(byText("Accept all")).should(disappear);
        }

    }


    public void clickAccesoAlTramite() {

        $(By.xpath("//*[@id='j_idt133']/div/input[2]")).click();
     }
    public void introducirDatosDelSolicitante(String notificacion) {
        aceptarPopupAvisoNotificacionesElectronicas();
        datosSolicitanteTelefono();
        datosSolicitanteCorreoElectronico();
        if(notificacion.equals("postal")) {
            datosSolicitanteClickNotificacionPostal();
            introducirValoresNotificacionPostal();
        }else{
            datosSolicitanteClickNotificacionElectronica();
            aceptarPopupAvisoNotificacionesElectronicas();
            datosSolicitanteClickSiguiente();
        }
    }

    public void clickObtenerJustificanteQuejaYSugerencia() {
        sleep(35000);
        $(By.id("formDescargaPDF:botonDescarga")).click();
        sleep(1000);
    }
    public  void introducirValoresRepresentanteYPersonaConNotificacion(String tipoPersona, String nacionalidad, String tipoNotificacion) {
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
            datosSolicitanteTelefonoInteresado();//Cambiar a datos solicitante interesado identificacionSolicitante:telefonoSoli
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
}