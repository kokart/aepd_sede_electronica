package com.aepd.test.QuejasYSugerencias;

import com.aepd.page.BasePage;
import com.aepd.page.Sede.QuejasYSugerencias.QuejasYSugerenciasPage;
import com.aepd.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class QuejasPersonaJuridicaTest extends BaseTest {
    QuejasYSugerenciasPage qys = new QuejasYSugerenciasPage(driver);

    @Test(description = "Representante presenta escrito como Nombre propio con Notificación Electronica")
    public void PersonaJuridicaPresentaQuejaNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("electronica");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta escrito como Nombre propio con Notificación Postal")
    public void PersonaJuridicaPresentaQuejaNombrePropioConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("postal");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta queja como Representante Interesado Persona física Española con Notificacion Postal")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "española", "postal");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta queja como Representante Interesado Persona física Española con Notificacion Electrónica")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "española", "electronica");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta queja como Representante Interesado Persona física No Española con Notificación Postal")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaFisicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "no española", "postal");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta queja como Representante Interesado Persona Jurídica Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaJuridicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "española", "electronica");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta queja como Representante Interesado Persona Jurídica No Española con Notificación Postal")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaJuridicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "no española", "postal");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

    @Test(description = "Representante presenta queja como Representante Interesado Persona Fisica No  Española con Notificación Electronica")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaFisicaNoEspañolaConNotificacionElectrónica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "no española", "electronica");
    }
    @Test(description = "Representante presenta queja como Representante Interesado Persona Juridica Española con Notificación Postal")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaJuridicaEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "española", "postal");
    }

    @Test(description = "Representante presenta queja como Representante Interesado Persona Jurídica No Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaQuejaRepresentanteInteresadoPersonaJuridicaNoEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "no española", "electronica");

    }
}

