# Prototype Design Pattern
1. It is used when we want to create the copy of object.
2. It is used when creation of object is very costly operation.
3. We implement this pattern by cloning the object (clone method).
4. We need to focus on requirement of deep or shallow copy
    1. Deep Copy: New Instance of object with same properties
    2. Shallow Copy: Same Instance in two reference type objects (Object is same, they are sharing it)

`Object.clone() is one of the example in java`