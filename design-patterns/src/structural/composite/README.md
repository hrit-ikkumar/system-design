# Composite Design Pattern
`Consider Composities and leaf nodes in same way`

1. We have parent-child or whole-part relation between objects. We can use composite pattern to simplify dealing with such object arrangements.
2. Goal of composite pattern is to simplify the client code by allowing it to treat the composites and leaf nodes in same way.
3. Composites will delegate the operations to its children while leaf nodes implement the functionality.
4. We need to decide which methods the base component will define. Adding all methods here will allow client to treat all nodes same. But it may force classes to implement behaviour which they don't have. 

`maily used in UI framework, In JSF UIViewRoot class acts as composite pattern`