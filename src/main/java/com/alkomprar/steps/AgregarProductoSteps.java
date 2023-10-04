package com.alkomprar.steps;


import com.alkomprar.utils.EsperaImplicita;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import com.alkomprar.pages.AgregarProductoPage;
import org.openqa.selenium.Keys;

import java.util.Random;


public class AgregarProductoSteps {

    @Page
    AgregarProductoPage agregarProductoPage;

    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Url");
        String url=data.get(0).get("Url");
        agregarProductoPage.openUrl(url);
        //registroPage.openUrl(url);
    }

    @Step("limpiar campo buscar")
    public void limpiarCampoBuscar(){
        agregarProductoPage.getDriver().findElement(agregarProductoPage.getTxtBuscar()).clear();

    }
    @Step("ubicarme campo buscar")
    public void seleccionarCampoBuscar(){
        agregarProductoPage.getDriver().findElement(agregarProductoPage.getTxtBuscar()).click();

    }

    @Step("Ingresar producto buscar" )
    public void ingresarProducto() throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Search");
        String producto = data.get(0).get("producto");
        agregarProductoPage.getDriver().findElement(agregarProductoPage.getTxtBuscar()).sendKeys(producto);
        EsperaImplicita.esperaImplicita(3);
    }

    @Step("Hacer Clic buscar")
    public void clicBuscar(){
        //agregarProductoPage.getDriver().findElement(agregarProductoPage.getBtnBuscar()).sendKeys(Keys.ENTER);
        agregarProductoPage.getDriver().findElement(agregarProductoPage.getTxtBuscar()).sendKeys(Keys.ENTER);
    }

    @Step("Seleccionar producto")
    public void seleccionarProducto(){
        EsperaImplicita.esperaImplicita(3);
        int tamProducto = agregarProductoPage.listProducto.size();

        Random numero = new Random();

        int Producto = numero.nextInt(tamProducto);

        agregarProductoPage.listProducto.get(Producto).click();


    }

    @Step("Agregar carrito")
    public void clicCarrito(){
        EsperaImplicita.esperaImplicita(3);
        agregarProductoPage.getDriver().findElement(agregarProductoPage.getBntagregarCarrito()).click();

    }

    @Step("Validacion producto en carrito")
    public void validarProductoCarrito(){
        EsperaImplicita.esperaImplicita(3);
        /*Assert.assertTrue(
                agregarProductoPage.getDriver().findElement(
                        agregarProductoPage.getLabelProductoAgregado()
                ).isDisplayed()
        );
        */
        Assert.assertTrue(
                agregarProductoPage.getDriver().findElement(
                        agregarProductoPage.getLabelProductoAgregado()
                ).isDisplayed()
        );


    }





}
