# Singleton Design Pattern

1. It is used to create a single object of a class.
2. We can make constructor private so no more inheritance or creation of object
3. We will create a public method to provide that instance
4. Two ways of doing it
    1. Eager Singleton: We create instance as soon as class is loaded (static word use)
    2. Lazy Singleton: We wait until code requires the instance (using some method)
5. Always prefer Eager loading unless creation of object is high and start-up time is noticeable.

`java.lang.Runtime is example of singleton in java`