package homework.chapter7;

public class BoxOverLoad {
    double widht;
    double height;
    double depth;

    BoxOverLoad() {
        widht = -1;
        height = -1;
        depth = -5;
    }

    BoxOverLoad(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    BoxOverLoad(double len) {
        widht = depth = height = len;
    }

    double volume() {
        return widht * height * depth;
    }

    BoxOverLoad(BoxOverLoad ob){
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }
}
