package com.aepd.test.QuejasYSugerencias;

import com.aepd.page.BasePage;
import com.aepd.page.Sede.QuejasYSugerencias.QuejasYSugerenciasPage;
import com.aepd.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class QuejasPersonaFisicaTest extends BaseTest {
    QuejasYSugerenciasPage qys = new QuejasYSugerenciasPage(driver);

    @Test(description = "Persona Física presenta queja como Nombre propio con Notificación Electrónica")
    public void PersonaFisicaPresentaQuejaNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarUsuarioConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("electrónica");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarPersonaFísicaUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

    @Test(description = "Persona física presenta queja como Nombre propio con Notificación Postal")
    public void PersonaFisicaPresentaQuejaNombrePropioConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.autenticarUsuarioConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("postal");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarPersonaFísicaUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

}
