package com.example.aiotestpoc.test.AEPD.QuejasYSugerencias;

import com.example.aiotestpoc.page.Sede.QuejasYSugerencias.QuejasYSugerenciasPage;
import com.example.aiotestpoc.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class QuejasPersonaJuridicaTest extends BaseTest {
    QuejasYSugerenciasPage qys = new QuejasYSugerenciasPage(driver);

    @Test(description = "Representante presenta escrito como Nombre propio con Notificación Electronica")
    public void PersonaJuridicaPresentaSugerenciaNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        qys.openConsultasAEPD();
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
    public void PersonaJuridicaPresentaSugerenciaNombrePropioConNotificacionPostal() throws IOException, AWTException {
        qys.openConsultasAEPD();
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
    @Test(description = "Representante presenta escrito como Representante Interesado Persona física Española con Notificacion Postal")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.openConsultasAEPD();
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
    @Test(description = "Representante presenta escrito como Representante Interesado Persona física Española con Notificacion Electrónica")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaFisicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.openConsultasAEPD();
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
    @Test(description = "Representante presenta escrito como Representante Interesado Persona física No Española con Notificación Postal")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaFisicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.openConsultasAEPD();
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
    @Test(description = "Representante presenta escrito como Representante Interesado Persona Jurídica Española con Notificación Electrónica")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaJuridicaEspañolaConNotificacionElectronica() throws IOException, AWTException {
        qys.openConsultasAEPD();
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
    @Test(description = "Representante presenta escrito como Representante Interesado Persona Jurídica No Española con Notificación Postal")
    public void PersonaJuridicaPresentaSugerenciaRepresentanteInteresadoPersonaJuridicaNoEspañolaConNotificacionPostal() throws IOException, AWTException {
        qys.openConsultasAEPD();
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
}

