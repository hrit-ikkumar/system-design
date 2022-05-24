package liskov_substitution.before;

public class LiskovSubstitutionBefore {
    public static void main(String args[]) {
        Rectangle r = new Square(5);

        setRectangleValue(r, 5, 10);

        int res = r.computeArea();
    }

    private static void setRectangleValue(Rectangle r, int h, int w) {
        r.setH(h);
        r.setW(w);
    }
}

/*
      Issue with Liskov Substitution Principle
      - Child classes must be completely substitutable for their Parent classes
      - Here we are updating rectangle reference typed variable with
      - Square type object inside it.
      - Developer doesn't know what is updating. He is under-impression that he is
      - updating rectangle object but square object is updating the variables here
      - In brief, Child class must be completely substitutable by its parent class
 */
