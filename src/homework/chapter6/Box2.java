package homework.chapter6;

public class Box2 {
    double width;
    double heigt;
    double depth;

    double volume() {
        return width * heigt * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        heigt = h;
        depth = d;
    }
}
