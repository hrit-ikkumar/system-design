package open_closed.after;

public interface Shape {
   public int calculateArea();
}
/*
   Solving Open-Closed Principle
   -  Whenever we want to add a new shape
   -  We can simply implement the method or extend a class
   -  to write the separate implementation of new Shape for calculating area
   -  Here we can extend the functionality but it is closed for modification
 */