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
public class ConsultaAEPDPersonaJuridicaTest extends BaseTest {
    ConsultaAEPDPage consulta = new ConsultaAEPDPage(driver);

    @Test(description = "Persona juridica presenta escrito mediante certificado electronico")
    public void PersonaJurídicaPresentaConsultaCertificado() throws IOException, AWTException {
        consulta.abrirURL(BasePage.URL_CONSULTAS_AEPD);
        consulta.clickLinkPorTexto("Electrónico");
        consulta.autenticarRepresentanteConCertificadoDigital();
        consulta.clickLinkPorTexto("Acceso al trámite");
        consulta.rellenarFormularioConsultaConClasificacionTituloConsulta("03", "Titulo consulta representante", "Consulta de prueba utilizando representante");
        consulta.confirmacionDatosCertificado();
        consulta.firmarRepresentanteUsandoCertificado();
        consulta.clickObtenerJustificante();
    }

}
