# Patron Adapter

El objetivo principal de este patron es permitir que dos interfaces incompatibles puedan trabajar juntas. 
Esto se logra creando una clase intermedia o adaptador, que actúa como un puente entre dos interfaces que de otra manera no podrían interactuar directamente.

El patrón adaptador es útil en situaciones en las que no puedes o no debes modificar el código fuente del adapter, pero aún necesitas que funcione con el cliente que espera una interfaz diferente.


**PROS**

* Permite la reutilización de clases o componentes existentes que de otro modo no serían compatibles con el sistema.
* Facilita la integración de componentes de terceros o bibliotecas con diferentes interfaces en tu aplicación sin necesidad de modificar su código fuente.
* Mantiene la cohesión y la encapsulación al evitar cambios en las clases existentes. Esto ayuda a reducir el riesgo de introducir errores en el código existente.


**CONTRAS**

* Introduce una capa adicional de complejidad en el código debido a la necesidad de crear y mantener adaptadores.
* La existencia de adaptadores puede dificultar la depuración de problemas, ya que las llamadas pueden pasar por varias capas antes de llegar al adaptee real.
* Los adaptadores pueden generar un pequeño overhead de rendimiento debido a la llamada adicional de métodos y traducción de llamadas.


