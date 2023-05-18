package com.example.aiotestpoc.page.Sede.ConsultaDPD;


import com.codeborne.selenide.Configuration;
import com.example.aiotestpoc.page.Sede.comun.AftSedeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class ConsultaAEPDStepDefinitions {

    public void openConsultasAEPD() throws IOException {

        ChromeOptions options = new ChromeOptions();
        Configuration.browserSize = "1920x1080";
        options.addArguments("--remote-allow-origins=*");
        Configuration.browserCapabilities = options;
        open("https://sede-cer-vdc-1.agpd.local/sede-electronica-web/vistas/formConsulta/consulta.jsf");
        getWebDriver().manage().timeouts().pageLoadTimeout(80, SECONDS);
    }
    public void clickConfirmarDatos() {
        confirmacionDatosClickEnviar();
        $(By.xpath("//*[@id='tinycontent']/div/input[1]")).click();
        sleep(1000);
        Alert alert = switchTo().alert();
        alert.accept();
        sleep(1000);
        //Botón acceder de clave usando certificado electrónico
        $(By.xpath("//*[@id='wrap']/div[2]/section/div/ul/li[1]/article/div[2]/div/fieldset/div/a/span")).click();
    }

    private static void confirmacionDatosClickEnviar() {
        $(By.id("botonFirmar")).click();
    }


    public void esperarFirmaRealizada() {
        sleep(20000);
    }


    public void esperarFirmaRealizadaRepresentante() {
        sleep(35000);
    }


    public void rellenarFormularioConsultaConClasificacionTituloConsulta(String codigo, String titulo, String consulta) {
        formularioConsultaCorreoElectronico();
        formularioConsultaIntroducirConsulta(codigo, titulo, consulta);
        sleep(1000);
        formularioConsultaClickEnviarDatos();
        sleep(3000);
    }

    private static void formularioConsultaClickEnviarDatos() {
        $(By.id("formularioConsulta:enviarDatos")).click();
    }

    private static void formularioConsultaIntroducirConsulta(String codigo, String titulo, String consulta) {
        $(By.id("formularioConsulta:clasificacion")).selectOptionByValue(codigo);
        $(By.id("formularioConsulta:tituloConsulta")).val(titulo);
        $(By.id("formularioConsulta:consultaDesc")).val(consulta);
    }

    private static void formularioConsultaCorreoElectronico() {
        $(By.id("formularioConsulta:correoElectronico")).val(AftSedeTest.ConDPDCorreoElectronico);
    }
}