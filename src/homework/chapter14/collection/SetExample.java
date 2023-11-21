package homework.chapter14.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> mySet = new LinkedHashSet<>(); //TreeSet<>();//HashSet<>();
        mySet.add(5);
        mySet.add(1);
        mySet.add(17);
        mySet.add(11050);//не добавляется дубликат
        mySet.add(11050);
        mySet.add(2);
        for (Integer i : mySet) {
            System.out.println(i);
        }
        mySet.remove(17);
        for (Integer i : mySet) {
            System.out.println(i);
        }
    }
}
