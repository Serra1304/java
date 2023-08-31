# Patron Factory Method

El patrón Factory Method es un patrón que proporciona una manera de crear objetos sin especificar las clases concretas de objetos que se crearán. En lugar de crear objetos directamente mediante un constructor, el Factory Method define un método en una clase base (también conocida como creador) que las subclases pueden implementar para crear instancias de objetos.

**PROS**

* Permite crear objetos de diferentes tipos a través de la implementación de los creadores concretos. Esto proporciona una mayor flexibilidad al elegir qué objetos instanciar sin modificar el código que utiliza los objetos.
* Agregar nuevos tipos de productos (objetos) es más sencillo, ya que solo necesitas crear una nueva subclase de creador concreto y una nueva clase de producto. Esto facilita la expansión de tu sistema sin afectar el código existente.
* Reduce el acoplamiento entre el código que utiliza los objetos y las clases concretas de objetos.
* Al separar la creación de objetos de su uso, se sigue el principio de responsabilidad única y se logra un diseño más modular y mantenible.

**CONTRAS**

* La implementación del patrón Factory Method puede introducir cierta complejidad adicional en el código.
* Cada nuevo tipo de producto requiere la creación de clases adicionales, lo que puede aumentar la cantidad de clases en el sistema.
* En algunos casos simples, el uso del Factory Method podría ser innecesario y llevar a una solución más compleja de lo necesario.


