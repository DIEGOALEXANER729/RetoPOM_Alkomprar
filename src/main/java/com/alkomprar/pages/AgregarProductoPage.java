package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class AgregarProductoPage extends PageObject {

    By txtBuscar = By.id("js-site-search-input");

    @FindBy(how =  How.XPATH, using = "//*[@id=\"js-hits\"]/div/div/ol/li")
    public List<WebElementFacade> listProducto;

    //By bntagregarCarrito = By.xpath("//*[@id=\"addToCartButton\"]");

    By bntagregarCarrito = By.xpath("/html/body/main/section/div[1]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/button");

  //  By labelProductoAgregado = By.xpath("//*[@id=\"js-cart-modal\"]/div/div/div[1]/header/div");

    By labelProductoAgregado = By.xpath("//div[@class=\"sucess-message sucess-message-alkomprar\"]");

    //Metodos Getter
    public By getTxtBuscar() {
        return txtBuscar;
    }

    public List<WebElementFacade> getListProducto() {
        return listProducto;
    }

    public By getBntagregarCarrito() {
        return bntagregarCarrito;
    }

    public By getLabelProductoAgregado() {
        return labelProductoAgregado;
    }
}
