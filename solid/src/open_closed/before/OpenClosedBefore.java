package open_closed.before;

public class OpenClosedBefore {
    public static void main(String args[]) {
        AreaCalculatorService areaCalculatorService = new AreaCalculatorService();

        Rectangle r = new Rectangle(2, 5);
        int rArea = areaCalculatorService.calculateArea(r);

        Square s = new Square(5);
        int sArea = areaCalculatorService.calculateArea(s);
    }
}
