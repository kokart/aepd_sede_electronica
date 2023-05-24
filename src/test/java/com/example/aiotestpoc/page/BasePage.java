package com.example.aiotestpoc.page;

import com.example.aiotestpoc.page.Sede.comun.AftSedeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static com.example.aiotestpoc.page.Sede.EscritoAEPD.RegistroElectronicoStepDefinitions.clickObtenerJustificante;

public class BasePage {
    public static final String C_SCRIPTS_FIRMA_ACEPTAR_FIRMA_REPRESENTANTE_VBS = "C:\\scripts_firma\\AceptarFirmaRepresentante.vbs";
    public static final String C_SCRIPTS_FIRMA_ACEPTAR_FIRMA_CIUDADANO_VBS = "C:\\scripts_firma\\AceptarFirmaCiudadano.vbs";
    public WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Get Source Code of the Current Page
    public String getSourceCodeOfHTMLPage() {
        return driver.getPageSource();
    }

    public void clavePermanente() {
        $(byXpath("//*[@id='wrap']/div[2]/section/div/ul/li[3]/article/div[2]/div/fieldset/div/a/span")).click();
        sleep(1000);
    }


    public void introducirDatosClavePermanente() {
        $(By.id("id_owner")).val("92920000T");
        $(By.id("pin")).val("Entra001");
        $(By.id("btnFirmar")).click();
    }


    public void confirmacionDatosClavePermanente() {

        $(By.id("botonFirmarsinCert")).click();
        Alert alert = switchTo().alert();
        alert.accept();
        sleep(1000);
    }


    public void confirmacionDatosCertificado() throws IOException {
        $(By.id("botonFirmar")).click();
        Alert alert = switchTo().alert();
        alert.accept();
        sleep(1000);
    }


    public void clickLinkPorTexto(String linkText) {
        $(byText(linkText)).click();
        if ($(byText("Accept all")).isDisplayed()) {
            $(byText("Accept all")).shouldBe(visible).click();
            $(byText("Accept all")).should(disappear);
        }
    }

    public void anyadirAdjuntos(String nombreFichero, String descripcionFichero) {
        datosAdjuntosAñadirDocumento(nombreFichero,descripcionFichero);
        datosAdjuntosClickAnyadirDocumento();
        sleep(5000);
    }

    public void finalizarDatosAdjuntos() {
        datosAdjuntosClickSiguiente();
    }

    private static void datosAdjuntosAñadirDocumento(String nombreFichero, String descripcionFichero) {
        File file = $(By.id("formDoc:documento")).uploadFile(new File(AftSedeTest.SRC_TEST_RESOURCES + nombreFichero));
        $(By.id("formDoc:descripcionDoc")).val(descripcionFichero);
    }

    private static void datosAdjuntosClickAnyadirDocumento() {
        $(By.id("formDoc:btnincluir")).click();
    }

    private static void datosAdjuntosClickSiguiente() {
        $(By.id("formBoton:enviarDatos")).click();
    }

    public static void clickDnioCertificadoDigital() {
        $(By.xpath("//*[@id='wrap']/div[2]/section/div/ul/li[1]/article/div[2]/div/fieldset/div/a/span")).click();
    }

    public static void autenticarUsuarioConCertificadoDigital() {
        executeVBSFile("C:\\scripts_firma\\AutenticarUsuario.vbs");
        clickDnioCertificadoDigital();
    }

    public static void firmarPersonaFísicaUsandoCertificado() {
        clickFirmaCertificadoDigital();
        executeVBSFile(C_SCRIPTS_FIRMA_ACEPTAR_FIRMA_CIUDADANO_VBS);
    }

    public static void firmarRepresentanteUsandoCertificado() {
        clickFirmaCertificadoDigital();
        executeVBSFile(C_SCRIPTS_FIRMA_ACEPTAR_FIRMA_REPRESENTANTE_VBS);
    }

    private static void clickFirmaCertificadoDigital() {
        $(By.xpath("//*[@id='formlocal']/a/span[1]")).click();
        $(By.id("buttonSign")).click();
    }

    public static void executeVBSFile(String scriptToExecute){
        try {
            Runtime.getRuntime().exec ( "wscript " + scriptToExecute);
        } catch (IOException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();

        }
        sleep(2000);
    }

    public void autenticarRepresentanteConCertificadoDigital() {
                  executeVBSFile("C:\\scripts_firma\\AutenticarRepresentante.vbs");
                  clickDnioCertificadoDigital();
        }
}