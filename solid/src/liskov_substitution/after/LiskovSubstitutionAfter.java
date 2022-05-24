package liskov_substitution.after;

public class LiskovSubstitutionAfter {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(2, 10);

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
      - Here we have fixed the problem of falsy impression of updation
      - If developer is updating the rectangle type object then it is rectangle only
      - We have used one interface to have different-2 implementation of shape
 */
