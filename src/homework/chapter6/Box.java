package homework.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("volume is: " + width * height * depth);
    }

    double volume2() {
        return width * height * depth;
    }
}
