# Decorator Design Pattern
`Decorate the object with extra things (Add small behaviour to older object/class)`

1. Decorator is used when we want to add small behaviour on top of existing object.
2. A decorator has same interface as the object it decorates or contains. 
3. Decorators allow us to dynamically construct behaviour by using composition. A decorator can wrap another decorator which in turn wraps an original object.
4. Client of object is unaware of existence of decorator.

`Java's I/O package is an example of decorator: BufferedOutputStream/OutputStream`

