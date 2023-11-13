package homework.chapter14;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double d = iOb.average();
        System.out.println("average is: " + d);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        double d1 = dOb.average();
        System.out.println("average is: " + d1);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<>(fnums);
        double f = fOb.average();
        System.out.println("average is: " + f);

        System.out.println("comparison iOb and dOb");
        if (iOb.sameAvg(dOb)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        System.out.println("comparison iOb and fOb");
        if (iOb.sameAvg(fOb)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }
}
