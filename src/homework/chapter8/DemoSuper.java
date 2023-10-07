package homework.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,25,30);
        BoxWeight mybox2 = new BoxWeight(2,3,4,5);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1 vol is " + vol);
        System.out.println("mybox1 weight is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("mybox2 vol is " + vol);
        System.out.println("mybox2 weight is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("mybox3 vol is " + vol);
        System.out.println("mybox3 weight is " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("myclone vol is " + vol);
        System.out.println("myclone weight is " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("mycube vol is " + vol);
        System.out.println("mycube weight is " + mycube.weight);
    }
}
