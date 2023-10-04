package com.alkomprar.steps;

import com.alkomprar.pages.RegistroPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class RegistroSteps {

    @Page
    RegistroPage registroPage;

    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Url");
        String url=data.get(0).get("Url");
        registroPage.openUrl(url);
    }

    @Step("Clic mi Cuenta")
    public void cicMiCuenta(){

        registroPage.getDriver().findElement(registroPage.getBtnMiCuenta()).click();
    }

    @Step("limpiar campo correo")
    public void limpiarCampoCorreo(){
        registroPage.getDriver().findElement(registroPage.getTxtCorreo()).clear();
    }
    @Step("limpiar campo nombre")
    public void limpiarCampoNombre(){
        registroPage.getDriver().findElement(registroPage.getTxtNombres()).clear();
    }

    @Step("limpiar campo apellido")
    public void limpiarCampoApellido(){
        registroPage.getDriver().findElement(registroPage.getTxtApellidos()).clear();
    }

    @Step("limpiar campo telefono")
    public void limpiarCampoTelefono(){
        registroPage.getDriver().findElement(registroPage.getTxtTelefono()).clear();
    }

    @Step("Hacer Clic continuar")
    public void clicContinuar(){
        registroPage.getDriver().findElement(registroPage.getBtnContinuar()).click();
    }

    @Step("Hacer Clic finalizar registro")
    public void clicFinalizarRegistro(){
        registroPage.getDriver().findElement(registroPage.getBtnFinalizarReistro()).click();
    }

    @Step("Ingresar Correo" )
    public void ingresarCorreo() throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "DatosRegistro");
        String correo = data.get(0).get("correo");
        registroPage.getDriver().findElement(registroPage.getTxtCorreo()).sendKeys(correo);
    }

    @Step("Ingresar nombres")
    public void ingresarNombre() throws IOException{

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "DatosRegistro");
        String nombre  = data.get(0).get("nombre");

        registroPage.getDriver().findElement(registroPage.getTxtNombres()).sendKeys(nombre);
    }

    @Step("Ingresar apellidos")
    public void ingresarApellido() throws IOException{
       //
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "DatosRegistro");
        String apellido = data.get(0).get("apellido");
        registroPage.getDriver().findElement(registroPage.getTxtApellidos()).sendKeys(apellido);
    }

    @Step("Ingresar telefono")
    public void ingresarTelefono() throws IOException{

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "DatosRegistro");
        String telefono = data.get(0).get("telefono");
        registroPage.getDriver().findElement(registroPage.getTxtTelefono()).sendKeys(telefono);
    }

    @Step("acepter  terminos")
    public void clickTerminos(){
        registroPage.getDriver().findElement(registroPage.getCheckTerminos()).click();
    }

    @Step("Validacion mi cuenta")
    public void validarMiCuenta(){
        Assert.assertTrue(
                registroPage.getDriver().findElement(
                        registroPage.getLabelMiCuenta()
                ).isDisplayed()
        );


    }


}
