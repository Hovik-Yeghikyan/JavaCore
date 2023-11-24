package homework.collection;

import homework1.onlineStore.model.User;
import homework1.onlineStore.types.UserType;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        Map<String, User> myMap = new TreeMap<>();//LinkedHashMap<>();// HashMap<>();
        myMap.put("poxos@mail.ru", new User("A123","poxos","poxos@mail.ru","1234", UserType.ADMIN));
        myMap.put("pedros@mail.ru", new User("e010","petros","petros@mail.ru","1234", UserType.USER));
        myMap.put("martiros", new User("e060","martiros","martiros@mail.ru","1234", UserType.USER));

//      User user =   myMap.get(null);
//        System.out.println(user);

//        for (String key : myMap.keySet()) {
//            System.out.println(key + "----" + myMap.get(key));
//        }
//
//        for (User value : myMap.values()) {
//            System.out.println(value);
//        }

        for (Map.Entry<String, User> stringUserEntry : myMap.entrySet()) {
            System.out.println(stringUserEntry.getKey() + " -> " + stringUserEntry.getValue());
        }
    }
}
