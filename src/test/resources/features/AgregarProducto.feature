#language:es

Característica: Agregar un producto de forma exitosa al carrito de compras
  yo como usuario quiero  agregar producto al carrito y validar


  @Agregar
  Escenario: Agregar producto al carrito
    Dado que el usuario ingrese a la URL
    Cuando  realiza busqueda de producto
    Y selecciona producto de manera aleatoria
    Y agrega al carrito
    Entonces puede visualizar el producto dentro del carrito de compras