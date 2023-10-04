package com.alkomprar.stepDefinitions;


import com.alkomprar.steps.AgregarProductoSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class AgregarProductoStepDefinitions {

    @Steps
    AgregarProductoSteps agregarProductoSteps ;

    @Cuando("ingresa a la pagina alkomprar")
    public void ingresaALaPaginaAlkomprar()  throws IOException {
        agregarProductoSteps.abrirUrl();
    }
    @Cuando("realiza busqueda de producto")
    public void realizaBusquedaDeProducto() throws IOException  {
        agregarProductoSteps.limpiarCampoBuscar();
        agregarProductoSteps.ingresarProducto();
        agregarProductoSteps.seleccionarCampoBuscar();
        agregarProductoSteps.clicBuscar();

    }
    @Cuando("selecciona producto de manera aleatoria")
    public void seleccionaProductoDeManeraAleatoria() throws IOException  {
        agregarProductoSteps.seleccionarProducto();

    }
    @Cuando("agrega al carrito")
    public void agregaAlCarrito() throws IOException {
        agregarProductoSteps.clicCarrito();
    }
    @Entonces("puede visualizar el producto dentro del carrito de compras")
    public void puedeVisualizarElProductoDentroDelCarritoDeCompras() {
        agregarProductoSteps.validarProductoCarrito();

    }

}
