package homework.chapter14.collection;

import homework1.onlineStore.model.User;
import homework1.onlineStore.types.UserType;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("poxos");
//        names.add("petros");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println("---------");
//        names.remove(0);
//        for (String name : names) {
//            System.out.println(name);
//        }

//        List<Integer> numbers = new LinkedList<>();
//        numbers.add(5);
//        numbers.add(50);
//        numbers.add(67);
//`
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
//        System.out.println("---------");
//        numbers.remove(Integer.valueOf(50));// By number
//        numbers.remove(1);// By index
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }

//        List<User> users = new ArrayList<>();
//        User user = new User("A123","Valod","valod@mail.ru","1234", UserType.ADMIN);
//        users.add(user);
//        for (User user1 : users) {
//            System.out.println(user1);
//        }
        Queue <String> myQueue = new PriorityQueue<>();
        myQueue.add("Poxos");
        myQueue.add("Aram");
        myQueue.add("Zaven");
        for (String s : myQueue) {
            System.out.println(s);//печатает по алфавиту
        }

//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());//всегда печатает перывй элемент
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());

        System.out.println(myQueue.poll());//снимает по очереди
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());//печатает null

        for (String s : myQueue) {
            System.out.println(s);//ничего не печатает
        }

    }

}
