# Creational Design Patterns:

Creational patterns provide various object creation mechanisms which increase flexibility and reuse of existing code

## singleton pattern:
Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it". In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern:
1- Early (eager) Instantiation: creation of instance at load time. 
2- Lazy Instantiation: creation of instance when required.


## factory pattern:
This pattern  help us to create loosely coupled OOP by “defines an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses”.

This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor. so here will not use new Keyword directly.

## abstract factory pattern:
Provides an interface for creating families of related or dependent objects without specifying their concrete classes. It allows you to create objects without explicitly specifying their classes, which helps in making the code more flexible and easier to maintain.

## builder pattern:
used to construct complex objects step by step. It allows you to create objects with various configurations or parameters while keeping the construction process separate from the actual object creation.
Additionally, it allows you to create immutable objects (if desired) by making the product class's attributes final and initializing them only through the builder.

## prototype pattern: 
Use to create objects based on a prototype instance. It involves creating new objects by copying an existing object, known as the prototype, rather than instantiating new objects directly.
