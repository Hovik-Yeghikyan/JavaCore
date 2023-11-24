package homework.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Petros");
        names.add("Petros");
        names.add("Petros");
        names.add("Poxos");
        names.add("Poxos");
        names.add("Poxos");
        names.add("Martiros");
        names.add("Martiros");
        names.add("Martiros");
        System.out.println(uniqueNameCount(names));
    }
    public static int uniqueNameCount(List<String> names){
//        List<String> uniqueName = new ArrayList<>();
//        for (String name : names) {
//            if(!uniqueName.contains((name))){
//                uniqueName.add(name);
//            }
//        }

        return new HashSet<>(names).size();
    }
}
