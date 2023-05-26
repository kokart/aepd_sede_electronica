package com.aepd.test.QuejasYSugerencias;

import com.aepd.page.BasePage;
import com.aepd.page.Sede.QuejasYSugerencias.QuejasYSugerenciasPage;
import com.aepd.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SugerenciasPersonaFisicaTest extends BaseTest {
    QuejasYSugerenciasPage qys = new QuejasYSugerenciasPage(driver);

    @Test(description = "Sugerencia presenta escrito como Nombre propio con Notificación Electrónica")
    public void PersonaFisicaPresentaSugerenciaNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarUsuarioConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("electrónica");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarPersonaFísicaUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

    @Test(description = "Sugerencia presenta escrito como Nombre propio con Notificación Postal")
    public void PersonaFisicaPresentaSugerenciaNombrePropioConNotificacionPostal() throws IOException, AWTException {
        qys.abrirURL(BasePage.URL_QUEJAS_Y_SUGERENCIAS);
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.autenticarUsuarioConCertificadoDigital();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("postal");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarPersonaFísicaUsandoCertificado();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

}
