package homework.chapter6.box;

public class BoxDemo2 {
    public static void main(String[] args) {
        double vol;
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.width = 5;
        mybox1.height = 7;
        mybox1.depth = 11;

        mybox2.width = 22;
        mybox2.height = 14;
        mybox2.depth = 31;

        mybox1.volume();
        mybox2.volume();

        vol = mybox1.volume2();
        System.out.println("mybox volume is: " + vol);
        System.out.println("mybox2 volume is: " + mybox2.volume2());

    }
}
