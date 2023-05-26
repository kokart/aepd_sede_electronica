package com.aepd.test.PresentarEscritoRegistro;

import com.aepd.page.BasePage;
import com.aepd.test.BaseTest;
import com.codeborne.selenide.testng.ScreenShooter;
import com.aepd.page.Sede.EscritoAEPD.RegistroElectronicoPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
@Listeners({ ScreenShooter.class})
public class EscritosPersonaFisicaTest extends BaseTest {
    RegistroElectronicoPage regElecEscrito = new RegistroElectronicoPage(driver);

    @Test(description = "Persona física presenta escrito mediante certificado electronico y notif. postal")
    public void PersonaFisicaPresentaEscritoNomlasbrePropioConNotificacionPostal() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarUsuarioConCertificadoDigital();
        regElecEscrito.introducirDatosDelSolicitante("postal");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarPersonaFísicaUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }

    @Test(description = "Persona física presenta escrito mediante certificado electronico y notif. electronica")
    public void PersonaFisicaPresentaEscritoNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarUsuarioConCertificadoDigital();
        regElecEscrito.introducirDatosDelSolicitante("electronica");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarPersonaFísicaUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }


}
