package com.alkomprar.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class RegistroPage extends PageObject {

    By txtCorreo= By.id("js-login-email");

    By txtNombres = By.id("register.firstName");

    By txtApellidos = By.id("register.lastName");

    By txtTelefono = By.id("register.mobileNumber");

    By checkTerminos = By.xpath("//*[@id=\"alkostoRegisterForm\"]/div[7]/label");

    By btnContinuar = By.id("js-login-continue");

    By btnFinalizarReistro = By.xpath("//button[@class=\"button-primary btn-block js-btn-register-myaccount\"]");

    By btnMiCuenta = By.id("js-myaccount-header");

    By LabelMiCuenta = By.xpath("//div[@class=\"account-section-header visible module-title\"]");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }

    public By getTxtNombres() {
        return txtNombres;
    }

    public By getTxtApellidos() {
        return txtApellidos;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getBtnFinalizarReistro() {
        return btnFinalizarReistro;
    }

    public By getCheckTerminos() {
        return checkTerminos;
    }

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }

    public By getLabelMiCuenta() {
        return LabelMiCuenta;
    }
}
