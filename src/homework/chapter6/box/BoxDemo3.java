package homework.chapter6.box;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;
        mybox1.setDim(10, 12, 32);
        vol = mybox1.volume();
        System.out.println("mybox1 volume is: " + vol);
        mybox2.setDim(11, 6, 8);
        vol = mybox2.volume();
        System.out.println("mybox2 volume is: " + vol);
    }
}
