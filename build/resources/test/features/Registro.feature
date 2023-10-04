#language:es

Característica: Registro en pagina web de alkomprar
  yo como usuario quiero validar un registro exitoso en pagina de alkomprar

  @Registro
  Escenario: Registro exitoso
    Dado que el usuario ingrese a la URL
    Cuando el usuario de clik en mi cuenta, mi perfil ingrese correo y de click en continuar
    Y ingrese limpie datos e ingrese nombre, apellido, telefono y acepte terminos y condiciones
    Entonces puede visualizar un mensaje Mi cuenta en pantalla