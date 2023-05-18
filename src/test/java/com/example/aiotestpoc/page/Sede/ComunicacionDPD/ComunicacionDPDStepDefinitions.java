package com.example.aiotestpoc.page.Sede.ComunicacionDPD;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ComunicacionDPDStepDefinitions {

     public void introducirDatosSolicitanteAltaDPD() {
        $(By.id("identificacionSolicitante:telefono")).val("637306701");
        $(By.id("identificacionSolicitante:inputCorreoElect")).val("asoto@aepd.es");
        $(By.id("identificacionSolicitante:enviarDatos")).click();
    }

    public void seleccionarTipoDelegado() {
        System.out.println("Dentro tipo dele");
        //$(By.id("formDelegadoProteccionDPD:tipoEntidad")).selectOptionByValue("EF");
        //refresh();
        sleep(1000);
        $(By.id("formDelegadoProteccionDPD:tipoEntidad")).selectOptionByValue("EF");
        sleep(1000);
        $(By.id("formDelegadoProteccionDPD:recogerdatosFis")).click();
        $(By.id("formDelegadoProteccionDPD:anadirEmpresa")).click();


    }

    public void introducirDatosDelResponsableOEncargadoDelTratamiento() {
        sleep(1000);
        $(By.id("formDelegadoProteccionEmpresa:relacionDPD:0")).click();

        //Datos formulario entidad Privada
        $(By.id("formDelegadoProteccionEmpresa:actividadesPri")).selectOptionByValue("N21");
        $(By.id("formDelegadoProteccionEmpresa:cifEmp")).val("46773406P");
        $(By.id("formDelegadoProteccionEmpresa:fecha_input")).val("01/01/2023");
        $(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[7]/a")).click();
        $(By.id("formDelegadoProteccionEmpresa:calle")).val(("Antonio Saura"));
        $(By.id("formDelegadoProteccionEmpresa:numero")).val(("8"));
        $(By.id("formDelegadoProteccionEmpresa:codigoPostalEmp")).val(("28320"));
        $(By.id("formDelegadoProteccionEmpresa:localidadInputEmp_input")).val("PINTO");
        sleep(2000);
        $(By.xpath("//*[@id='formDelegadoProteccionEmpresa:localidadInputEmp_panel']/ul/li")).click();
        $(By.id("formDelegadoProteccionEmpresa:correoElectronicoEmp")).val("asoto@aepd.es");

        //Datos de contato del DPD
        $(By.id("formDelegadoProteccionEmpresa:dedaCalleNot")).val("Calle pruebas");
        $(By.id("formDelegadoProteccionEmpresa:dedaNumeroNot")).val("8");
        $(By.id("formDelegadoProteccionEmpresa:dedaCodigoPostal")).val("28320");
        $(By.id("formDelegadoProteccionEmpresa:dedaLocalidadInput_input")).val("PINTO");
        sleep(2000);
        $(By.xpath("//*[@id='formDelegadoProteccionEmpresa:dedaLocalidadInput_panel']/ul/li")).click();
        $(By.id("formDelegadoProteccionEmpresa:dedaCorreoElectronico")).val("asoto@aepd.es");

        $(By.id("formDelegadoProteccionEmpresa:anadirEmpresa")).click();
        $(By.id("formDelegadoProteccionEmpresa:siguiente")).click();
    }

    public void buscarResponsableOEncargado() {
        $(By.id("operacion:cifBusqueda")).val("00000000T");
        $(By.id("operacion:denominacionBusqueda")).val("TEST-EVA");
        $(By.id("operacion:buscarDPD")).click();
        sleep(1000);
        $(By.id("operacion:j_idt134:0:bot")).click();

    }

    public void introducirDatosDelDelgadoDeProteccDeDatos() {
        Alert alert = switchTo().alert();
        alert.accept();
        $(By.id("formDelegadoProteccionDPD:tipoEntidad")).selectOptionByValue("EF");
        sleep(1000);
        sleep(1000);
        $(By.id("formDelegadoProteccionDPD:nombrelFis")).val("Nombre");
        $(By.id("formDelegadoProteccionDPD:apellido1Fis")).val("Apellido 1");
        $(By.id("formDelegadoProteccionDPD:apellido2Fis")).val("Apellido");
        $(By.id("formDelegadoProteccionDPD:docIndetif")).selectOptionByValue("2");
        $(By.id("formDelegadoProteccionDPD:nifFis")).val("46773406P");
        $(By.id("formDelegadoProteccionDPD:entidadFis")).val("Entidad");
        $(By.id("formDelegadoProteccionDPD:cifFis")).val("U33574765");
        $(By.id("formDelegadoProteccionDPD:correoElectronicoDpd")).val("asoto@aepd.es");

        $(By.id("formDelegadoProteccionDPD:anadirEmpresa")).click();
        sleep(50000);

    }
}