package com.aepd.test.QuejasYSugerencias;

import com.aepd.page.BasePage;
import com.aepd.page.Sede.QuejasYSugerencias.QuejasYSugerenciasPage;
import com.aepd.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SugerenciasPersonaJuridicaTest extends BaseTest {
    QuejasYSugerenciasPage qys = new QuejasYSugerenciasPage(driver);

    @Test(description = "Representanqys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);te presenta sugerencia como Nombre propio con Notificación Electronica")
    public void PersonaJuridicaPresentaSugerenciaNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("electronica");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta sugerencia como Nombre propio con Notificación Postal")
    public void PersonaJuridicaPresentaSugerenciaNombrePropioConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("postal");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona física Española con Notificacion Postal")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "española", "postal");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona física Española con Notificacion Electrónica")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "española", "electronica");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona física No Española con Notificación Postal")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaFisicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "no española", "postal");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona Jurídica Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaJuridicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "española", "electronica");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }
    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona Jurídica No Española con Notificación Postal")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaJuridicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "no española", "postal");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarRepresentanteUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona Fisica No  Española con Notificación Electronica")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaFisicaNoEspañolaConNotificacionElectrónica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("fisica", "no española", "electronica");
    }
    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona Juridica Española con Notificación Postal")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaJuridicaEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "española", "postal");
    }

    @Test(description = "Representante presenta sugerencia como Representante Interesado Persona Jurídica No Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaJuridicaNoEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarRepresentanteConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirValoresRepresentanteYPersonaConNotificacion("juridica", "no española", "electronica");

    }
}

