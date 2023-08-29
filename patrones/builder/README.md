# Patron builder

El patron builder se utiliza para la creacion de objetos complejos paso a paso.
Este patrón separa la construcción de un objeto complejo de su representación, permitiendo que el mismo proceso de construcción pueda crear diferentes representaciones del objeto.
En lugar de tener un constructor con muchos parámetros o combinaciones complicadas de métodos, el patrón Builder utiliza una interfaz para definir los pasos de construcción y luego implementa varias clases concretas que siguen esa interfaz para construir el objeto de diferentes formas.

**PROS**

- El patrón Builder separa la lógica de construcción de la lógica de representación, lo que resulta en un código más limpio y mantenible al evitar la congestión de lógica de construcción en la clase principal del objeto.
- Permite crear diferentes representaciones del mismo objeto complejo, útil cuando se necesita construir objetos con distintas configuraciones.
- Mejora la legibilidad al proporcionar métodos explícitos para cada parte de la construcción en lugar de tener un constructor con numerosos parámetros.
- Aporta una estructura y un orden definidos a la construcción del objeto, ya que se definen pasos específicos en el proceso.
- Se pueden reutilizar los mismos builders para construir objetos similares, cambiando solo los pasos relevantes, en lugar de reescribir todo el proceso de construcción.

**CONTRAS**

- Aumentar la complejidad del código, ya que implica la creación de múltiples clases y la necesidad de coordinar su funcionamiento.
- En casos simples donde la construcción del objeto no es muy compleja, la introducción del patrón Builder podría ser excesiva y aumentar el overhead de diseño.
- Si no se está familiarizado con el patrón Builder, podría llevar tiempo comprender su estructura y cómo implementarlo de manera efectiva.

