package homework.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDemo {

    public static void main(String[] args) {
        Map<User,Integer> userAttempt = new HashMap<>();
        List<String> langList = new ArrayList<>();
        langList.add("Arm");
        langList.add("Ru");
        User user = new User("poxos", "poxosyan", "poxos@mail.ru", "1234", langList);
        System.out.println(user);
        System.out.println(user.hashCode());
        userAttempt.put(user,1);
        user.getLanguageList().add("eng");
       // langList.add("eng");

        System.out.println(userAttempt.get(user));

      //  System.out.println(user);
//
//        System.out.println(user);
//        System.out.println(user.hashCode());
    }
}

