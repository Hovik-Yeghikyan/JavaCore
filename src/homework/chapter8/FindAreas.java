package homework.chapter8;

public class FindAreas {
    public static void main(String[] args) {
       // Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(5, 6);
        Triangle t = new Triangle(7, 8);
        Figure figuref;//true, although the object is not being created

        figuref = r;
        System.out.println("area is " + figuref.area());
        figuref = t;
        System.out.println("area is " + figuref.area());
       // figuref = f;
      //  System.out.println("area is " + figuref.area());


    }
}
