package com.aepd.test.PresentarEscritoRegistro;

import com.aepd.page.BasePage;
import com.aepd.page.Sede.EscritoAEPD.RegistroElectronicoPage;
import com.aepd.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

public class EscritosPersonaJuridicaTest extends BaseTest {
    RegistroElectronicoPage regElecEscrito = new RegistroElectronicoPage(driver);


    @Test(description = "Representante presenta escrito como Nombre propio con Notificación Electronica")
    public void PersonaJuridicaPresentaEscritoNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresNombrePropioConNotificacion("electronica");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarRepresentanteUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }


    @Test(description = "Representante presenta escrito como Nombre propio con Notificación Postal")
    public void PersonaJuridicaPresentaEscritoNombrePropioConNotificacionPostal() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresNombrePropioConNotificacion("postal");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarRepresentanteUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();

    }
    @Test(description = "Representante presenta escrito como Representante Interesado Persona física Española con Notificacion Postal")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionPostal() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("fisica","española","postal");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarRepresentanteUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }
    @Test(description = "Representante presenta escrito como Representante Interesado Persona física Española con Notificacion Electrónica")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("fisica","española","electronica");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarRepresentanteUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }
    @Test(description = "Representante presenta escrito como Representante Interesado Persona física No Española con Notificación Postal")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaFisicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("fisica"," no española","postal");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarRepresentanteUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }

    @Test(description = "Representante presenta escrito como Representante Interesado Persona física No Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaFisicaNoEspañolaConNotificacionElectrónica() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("fisica","no española","electronica");
    }
    @Test(description = "Representante presenta escrito como Representante Interesado Persona Jurídica Española con Notificación Postal")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaJuridicaEspañolaConNotificacionPostal() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("fisica","española","postal");
    }
   
    @Test(description = "Representante presenta escrito como Representante Interesado Persona Jurídica Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaJuridicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("juridica","española","electronica");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarRepresentanteUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }
    @Test(description = "Representante presenta escrito como Representante Interesado Persona Jurídica No Española con Notificación Postal")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaJuridicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("juridica","no española","postal");
        regElecEscrito.escribirDatosEntrada();
        regElecEscrito.anyadirAdjuntos("a.txt", "Adjunto Prueba");
        regElecEscrito.finalizarDatosAdjuntos();
        regElecEscrito.confirmacionDatosCertificado();
        regElecEscrito.firmarRepresentanteUsandoCertificado();
        regElecEscrito.clickObtenerJustificante();
    }
    @Test(description = "Representante presenta escrito como Representante Interesado Persona Jurídica No Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaEscritoRepresentanteInteresadoPersonaJuridicaNoEspañolaConNotificacionElectronica() throws IOException, AWTException {
        regElecEscrito.abrirURL(BasePage.URL_SEDE_ELECTRONICA);
        regElecEscrito.clickLinkPorTexto("SOY UN CIUDADANO");
        regElecEscrito.clickLinkPorTexto("Registro Electrónico AEPD");
        regElecEscrito.clickLinkPorTexto("Continuar");
        regElecEscrito.clickLinkPorTexto("Registro inicial");
        regElecEscrito.clickLinkPorTexto("ESCRITO");
        regElecEscrito.autenticarRepresentanteConCertificadoDigital();
        regElecEscrito.introducirValoresRepresentanteYPersonaConNotificacion("juridica","no española","electronica");
    }
}


