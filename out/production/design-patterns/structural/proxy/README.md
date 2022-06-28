# Proxy Design Pattern
`When object acts as substitutue for real object`

1. We want a stand in or placeholder object or we want control access to our objects method, then we can use a proxy pattern.
2. Proxy implements same interface as expected of real object. It delegates actual functionality to real object or they create one when needed. Some proxies talk to remote service behind the scene.
3. Main usage of proxies for:
    1. Protection Proxy: Control access to original object's operations
    2. Remote Proxy: Provides a local representation of a remote object
    3. Virtual Proxy: Delays construction of original object until necessary
4. In java, we can also use dynamic proxies. These are created on the fly at runtime.

`Aspect Oriented Programming (AOP) uses proxy in spring boot, Hibernate also uses proxy for lazy loading of data.`