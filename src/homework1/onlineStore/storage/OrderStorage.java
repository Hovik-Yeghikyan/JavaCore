//package homework1.onlineStore.storage;
//
//import homework1.onlineStore.model.Oreder;
//
//public class OrderStorage {
//
//    private Oreder[] oreders = new Oreder[10];
//    private int size;
//
//    public void add(Oreder product) {
//        if (size == oreders.length) {
//            extand();
//        }
//        oreders[size++] = product;
//    }
//
//    private void extand() {
//
//        Oreder[] temp = new Oreder[oreders.length+ 10];
//        System.arraycopy(oreders, 0, temp, 0, oreders.length);
//        oreders = temp;
//    }
//}
