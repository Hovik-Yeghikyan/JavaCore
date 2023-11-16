package homework.chapter14;

public class StorageTest {

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("Poxos");
        stringStorage.add("Petros");
     //  stringStorage.print();

//        String byIndex = stringStorage.getByIndex(1);
//        System.out.println(byIndex);

        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(10);
        intStorage.add(25);
        intStorage.print();
    }
}
