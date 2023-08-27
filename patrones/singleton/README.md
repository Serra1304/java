# Patron Singleton
El patrón Singleton se utiliza para asegurarse de que una clase tenga una única instancia, a la vez de proporcionar un punto global de acceso a esa instancia desde cualquier parte del programa.
Es importante tener en cuenta que un uso excesivo de patrones Singleton puede llevar a acoplamientos fuertes y dificultar las pruebas unitarias, por lo que su uso debe ser cuidadoso y justificado.

**PROS**

- Puedes tener la certeza de que una clase tiene una única instancia.
- Obtienes un punto de acceso global a dicha instancia.
- El objeto Singleton solo se inicializa cuando se requiere por primera vez.
- Evita la creación de múltiples instancias innecesarias, lo que puede ahorrar memoria y recursos en la aplicación.
- Permite la inicialización diferida de la instancia, lo que significa que la instancia se crea solo cuando es necesaria por primera vez.

**CONTRAS**

- Vulnera el Principio de responsabilidad única. El patrón resuelve dos problemas al mismo tiempo.
- El patrón Singleton puede enmascarar un mal diseño, por ejemplo, cuando los componentes del programa saben demasiado los unos sobre los otros.
- El patrón requiere de un tratamiento especial en un entorno con múltiples hilos de ejecución, para que varios hilos no creen un objeto Singleton varias veces.
- Puede resultar complicado realizar la prueba unitaria del código cliente del Singleton porque muchos frameworks de prueba dependen de la herencia a la hora de crear objetos simulados.
- El uso excesivo del patrón Singleton puede llevar a un acoplamiento fuerte entre las clases que lo utilizan y la clase Singleton, lo que puede dificultar la modularidad y la reutilización del código.
- Extender una clase Singleton puede ser complicado, ya que la subclase también debe asegurarse de mantener el patrón Singleton, lo que puede aumentar la complejidad del diseño.

### Importante
Para garantizar la correcta ejecución multihilo de una implementación Singleton, es importante aplicar técnicas de sincronización o usar mecanismos de inicialización segura para evitar la creación de instancias duplicadas. 

