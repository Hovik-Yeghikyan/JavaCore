package homework.chapter14;

public class HierDemo3 {

    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(44);
        Gen2<String> strOb2 = new Gen2<>("Java 2023");

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("iob2->Gen2");
        }
        if (iOb2 instanceof Gen<?>) {
            System.out.println("iob2->Gen");
        }


        if (strOb2 instanceof Gen2<?>) {
            System.out.println("strOb->Gen2");

    }
        if (strOb2 instanceof Gen<?>) {
            System.out.println("strOb->Gen");

    }
        if (iOb instanceof Gen2<?>) {
            System.out.println("iob->Gen2");
        }
        if (iOb instanceof Gen<?>) {
            System.out.println("iob->Gen");
        }
        }
    }
