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


        System.out.println(myArray.getByArray(11));
        System.out.println(myArray.getByArray(0));
        System.out.println(myArray.getByArray(9));
        System.out.println(myArray.getByArray(8));
        System.out.println(myArray.getByArray(5));
        System.out.println(myArray.getByArray(17));
        System.out.println(myArray.getByArray(20));
        System.out.println();
        System.out.println(myArray.getByArray(96));
        System.out.println();
        myArray.print();
    }
}
