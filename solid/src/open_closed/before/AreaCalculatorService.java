package open_closed.before;

public class AreaCalculatorService {
    public int calculateArea(Object shape) {
        int result = 0;

        if (shape instanceof Rectangle) {
            result = ((Rectangle) shape).height * ((Rectangle) shape).width;
        } else if (shape instanceof Square) {
            result = ((Square) shape).side*((Square) shape).side;
        } else {
            // not an supported shape
            result = - 1;
        }

        return result;
    }
}

/*
    Issue with Area Calculator Service:
    - Here we are violating Open Closed Principle
    - Open Closed means: Open for extension but closed for modification
    - Whenever we need to support the feature of new shape
    - We need to make the change here which mean we are modifying the class
    - Another if/elseif statement inside the area calculator method
 */