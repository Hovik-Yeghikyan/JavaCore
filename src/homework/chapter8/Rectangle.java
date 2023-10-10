package homework.chapter8;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("in the area of rectangle");
        return dim1 * dim2;
    }
}
