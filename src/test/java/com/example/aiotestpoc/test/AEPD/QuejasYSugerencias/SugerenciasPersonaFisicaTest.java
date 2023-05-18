package com.example.aiotestpoc.test.AEPD.QuejasYSugerencias;

import com.example.aiotestpoc.page.Sede.QuejasYSugerencias.QuejasYSugerenciasPage;
import com.example.aiotestpoc.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SugerenciasPersonaFisicaTest extends BaseTest {
    QuejasYSugerenciasPage qys = new QuejasYSugerenciasPage(driver);

    @Test(description = "Sugerencia presenta escrito como Nombre propio con Notificación Electrónica")
    public void PersonaFisicaPresentaSugerenciaNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        qys.openConsultasAEPD();
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.seleccionCertificado();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("electrónica");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarConCertificadoElectronico();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

    @Test(description = "Sugerencia presenta escrito como Nombre propio con Notificación Postal")
    public void PersonaFisicaPresentaSugerenciaNombrePropioConNotificacionPostal() throws IOException, AWTException {
        qys.openConsultasAEPD();
        qys.clickContinuarQuejaYSugerencia();
        qys.clickSugerencia();
        qys.clickElectronico();
        qys.seleccionCertificado();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("postal");
        qys.introducirSugerencia();
        qys.confirmacionDatosCertificado();
        qys.firmarConCertificadoElectronico();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

}
