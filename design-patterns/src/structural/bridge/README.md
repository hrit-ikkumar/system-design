# Bridge Design Patterns 
`Decouple abstraction and implementation and bridge them using this pattern`
1. When we want to decouple abstraction and implementation.
2. It separates inheritance hierarchies for abstraction & implementations and bridge these two together using composition.
3. Implementations do not have to define methods that match up with methods in abstraction. It is fairly common to have primitive methods; methods which do small work; in an implementor. Abstraction uses these methods to provide its functionality. 

`SLF4J logging framework and JDBC API(java.sql.Driver & java.sql.DriverManager is combined bridge pattern implementation in java)`