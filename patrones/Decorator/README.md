# Patron Decorador

El objetivo principal es permitir la adición de funcionalidad adicional a objetos individuales de manera dinámica y flexible, sin necesidad de modificar su estructura original.
El patrón decorador se implementa mediante la creación de una serie de clases que envuelven o decoran un objeto base. 
Estas clases decoradoras tienen la misma interfaz que el objeto base, lo que permite que se utilicen de manera intercambiable. 
Cada decorador agrega una capa de funcionalidad adicional al objeto base, y los decoradores se pueden apilar en cascada para proporcionar múltiples extensiones de funcionalidad.


**PROS**

* Permite agregar funcionalidad adicional a objetos de manera dinámica y flexible sin modificar su estructura original.
* Promueve una clara separación de responsabilidades al dividir la funcionalidad en clases pequeñas y específicas.
* Puedes agregar fácilmente nuevos decoradores sin afectar el código existente.
* Puedes añadir o eliminar responsabilidades de un objeto durante el tiempo de ejecución.


**CONTRAS**

* El código de configuración inicial de las capas pueden tener un aspecto desagradable.
* Resulta difícil eliminar un decorador específico de la pila de decoradores.
* Cada decorador adicional implica un pequeño costo de rendimiento debido a la indirección adicional en las llamadas a métodos.




