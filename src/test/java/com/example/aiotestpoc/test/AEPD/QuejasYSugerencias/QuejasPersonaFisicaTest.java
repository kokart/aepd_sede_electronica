package com.example.aiotestpoc.test.AEPD.QuejasYSugerencias;

import com.example.aiotestpoc.page.Sede.QuejasYSugerencias.QuejasYSugerenciasPage;
import com.example.aiotestpoc.test.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class QuejasPersonaFisicaTest extends BaseTest {
    QuejasYSugerenciasPage qys = new QuejasYSugerenciasPage(driver);

    @Test(description = "Persona Física presenta queja como Nombre propio con Notificación Electrónica")
    public void PersonaFisicaPresentaQuejaNombrePropioConNotificacionElectronica() throws IOException, AWTException {
        qys.openConsultasAEPD();
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
        qys.clickElectronico();
        qys.seleccionCertificado();
        qys.clickAccesoAlTramite();
        qys.introducirDatosDelSolicitante("electrónica");
        qys.introducirQueja();
        qys.confirmacionDatosCertificado();
        qys.firmarConCertificadoElectronico();
        qys.clickObtenerJustificanteQuejaYSugerencia();
    }

    @Test(description = "Persona física presenta queja como Nombre propio con Notificación Postal")
    public void PersonaFisicaPresentaQuejaNombrePropioConNotificacionPostal() throws IOException, AWTException {
        qys.openConsultasAEPD();
        qys.clickContinuarQuejaYSugerencia();
        qys.clickQueja();
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
