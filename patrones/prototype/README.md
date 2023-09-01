# Patron Prototype

El patrón de diseño Prototype se utiliza en el diseño de software para crear objetos duplicados o clonar objetos existentes sin depender de sus clases concretas. En esencia, este patrón permite crear nuevos objetos a partir de una instancia existente, evitando la necesidad de crear una nueva instancia desde cero.

El principal objetivo del patrón Prototype es mejorar la eficiencia y la flexibilidad del proceso de creación de objetos al evitar la duplicación de código y la repetición de operaciones costosas. En lugar de crear objetos complejos con numerosos atributos y configuraciones desde cero, el patrón Prototype permite copiar un objeto ya existente y modificarlo según sea necesario.


**PROS**

* Permite crear nuevas instancias de objetos duplicando prototipos existentes. Esto ofrece una gran flexibilidad para crear objetos con diferentes configuraciones sin necesidad de crear clases específicas para cada variación.
* Evita la necesidad de duplicar código para crear objetos similares.
* Puedes clonar objetos sin acoplarlos a sus clases concretas.
* Obtienes una alternativa a la herencia al tratar con preajustes de configuración para objetos complejos.
* Puedes crear objetos complejos con más facilidad.

**CONTRAS**

* Es necesario mantener y gestionar una colección de prototipos para que estén disponibles cuando sea necesario, lo que podría añadir complejidad al diseño.
* Si los objetos tienen referencias a otros objetos y son mutables, clonarlos puede ser complicado y llevar a resultados inesperados.
* La implementación de la clonación profunda (copiar todos los objetos internos) puede ser más complicada y propensa a errores.
* La clonación puede plantear problemas de seguridad si los objetos clonados contienen información confidencial. La copia podría ser accesible para partes no autorizadas.
