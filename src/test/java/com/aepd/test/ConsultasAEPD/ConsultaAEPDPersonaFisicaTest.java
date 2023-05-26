package com.aepd.test.ConsultasAEPD;

import com.aepd.page.BasePage;
import com.aepd.page.Sede.ConsultaDPD.ConsultaAEPDPage;
import com.aepd.test.BaseTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
@Listeners({ ScreenShooter.class})
public class ConsultaAEPDPersonaFisicaTest extends BaseTest {
    ConsultaAEPDPage consulta = new ConsultaAEPDPage(driver);

    @Test(description = "Persona física presenta consulta mediante certificado electronico")
    public void PersonaFisicaPresentaConsultaCertificado() throws IOException, AWTException {
        consulta.abrirURL(BasePage.URL_CONSULTAS_AEPD);
        consulta.clickLinkPorTexto("Electrónico");
        consulta.autenticarUsuarioConCertificadoDigital();
        consulta.clickLinkPorTexto("Acceso al trámite");
        consulta.rellenarFormularioConsultaConClasificacionTituloConsulta("01", "Titulo consulta certificado", "Consulta de prueba utilizando certificado");
        consulta.clickConfirmarDatos();
        consulta.clickObtenerJustificante();
    }
    @Test(description = "Persona física presenta consulta mediante clave permanente")
    public void PersonaFisicaPresentaConsultaClavePermanente() throws IOException, AWTException {
        consulta.abrirURL(BasePage.URL_CONSULTAS_AEPD);
        consulta.clickLinkPorTexto("Electrónico");
        consulta.seleccionarClavePermanente();
        consulta.introducirDatosClavePermanente();
        consulta.clickLinkPorTexto("Acceso al trámite");
        consulta.rellenarFormularioConsultaConClasificacionTituloConsulta("02", "Titulo consulta clave permanente", "Consulta de prueba utilizando clave permanente");
        consulta.clickConfirmarDatosCP();
        consulta.seleccionarClavePermanente();
        consulta.introducirDatosClavePermanente();
        consulta.clickObtenerJustificante();
    }

}
