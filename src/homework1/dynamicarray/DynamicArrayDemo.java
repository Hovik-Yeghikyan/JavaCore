package homework1.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray();
        myArray.add(65);
        myArray.add(55);
        myArray.add(64);
        myArray.add(22);
        myArray.add(91);
        myArray.add(88);
        myArray.add(85);
        myArray.add(78);
        myArray.add(54);
        myArray.add(15);
        myArray.add(77);
        myArray.add(66);
        myArray.add(44);
        myArray.add(596);
        myArray.add(168);
        myArray.add(925);
        myArray.add(145);
        myArray.add(155);
        myArray.add(22);
        myArray.add(153);
        myArray.add(855);
        myArray.add(985);
        myArray.add(741);
        myArray.add(122);


        System.out.println(myArray.getByIndex(11));
        System.out.println(myArray.getByIndex(0));
        System.out.println(myArray.getByIndex(96));
        myArray.print();
        myArray.deleteByIndex(3);
        myArray.print();
        myArray.deleteByIndex(0);
        myArray.print();
        myArray.deleteByIndex(10);
        myArray.print();
        myArray.set(11, 325);
        myArray.print();
        myArray.add(5, 744);
        myArray.print();
        myArray.add(87, 1670);
        System.out.println(myArray.exists(925));
        System.out.println(myArray.exists(1236));
        System.out.println(myArray.getIndexByValue(77));
        System.out.println(myArray.getIndexByValue(155));
        System.out.println(myArray.getIndexByValue(4125));

    }
}
