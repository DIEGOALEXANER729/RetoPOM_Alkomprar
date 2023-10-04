package com.alkomprar.stepDefinitions;


import com.alkomprar.steps.RegistroSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;


public class RegistroStepDefinitions {

    @Steps
    RegistroSteps registroSteps;

    @Dado("que el usuario ingrese a la URL")
    public void queElUsuarioIngreseALaURL() throws IOException {
        registroSteps.abrirUrl();
    }
    @Cuando("el usuario de clik en mi cuenta, mi perfil ingrese correo y de click en continuar")
    public void elUsuarioDeClikEnMiCuentaMiPerfilIngreseCorreoYDeClickEnContinuar() throws IOException  {
        registroSteps.cicMiCuenta();
        registroSteps.limpiarCampoCorreo();
        registroSteps.ingresarCorreo();
        registroSteps.clicContinuar();
    }
    @Cuando("ingrese limpie datos e ingrese nombre, apellido, telefono y acepte terminos y condiciones")
    public void ingreseLimpieDatosEIngreseNombreApellidoTelefonoYAcepteTerminosYCondiciones() throws IOException  {
        registroSteps.limpiarCampoNombre();
        registroSteps.limpiarCampoApellido();
        registroSteps.limpiarCampoTelefono();
        registroSteps.ingresarNombre();
        registroSteps.ingresarApellido();
        registroSteps.ingresarTelefono();
        registroSteps.clickTerminos();
        registroSteps.clicFinalizarRegistro();
    }
    @Entonces("puede visualizar un mensaje Mi cuenta en pantalla")
    public void puedeVisualizarUnMensajeMiCuentaEnPantalla() {
        registroSteps.cicMiCuenta();
        registroSteps.validarMiCuenta();

    }
}
