package homework.chapter6.box;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();
        Box mybox3 = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("vol is: " + vol);

        mybox2.width = 3;
        mybox2.height = 7;
        mybox2.depth = 11;

        System.out.println(mybox2.width + " " + mybox2.height + " " + mybox2.depth);
        System.out.println(mybox3.width + " " + mybox3.height + " " + mybox3.depth);

    }
}
