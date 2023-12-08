package homework.other;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClientDemo {

    public static void main(String[] args) {
//        Map<String,Client> map =  new TreeMap<>();
//        map.put("faven@mail.ru",new Client("Zaven", "Zavenyan","zaven@mail.ru",22,new Date()));
//        map.put("xrshak@mail.ru",new Client("Arshak","Arshak","arshak@mail.ru",25,new Date()));
//        map.put("valod@mail.ru",new Client("Valod","Valodyan","valod@mail.ru",15,new Date()));

//        for (Map.Entry<String, Client> stringClientEntry : map.entrySet()) {
//            System.out.println(stringClientEntry);
//        }
//        Client client = new Client ();
//        Client client1 = new Client("Exo","Exoyan","exo@mail.ru",43,new Date());
//        Client client2 = new Client();
//
//        System.out.println(client.compareTo(client1));
//        System.out.println(client1.compareTo(client2));

        List<Client> list = new ArrayList<>();
        list.add(new Client("Valod", "Valodyan", "valod@mail.ru", 66, new Date()));
        list.add(new Client("Exo", "Exoyan", "exo@mail.ru", 43, new Date()));
        list.add(new Client("zrshak", "Arshak", "Arshak@mail.ru", 25, new Date()));
new CallThread();
        new Thread(new Runnable() {
            @Override
            public void run() {
                list.sort(Comparator.comparing(Client::getSurname));
                for (Client client : list) {
                    System.out.println(client);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }).start();



//        list.sort(new ClientAgeComparator());
//        for (Client client : list) {
//            System.out.println(client);
//        }

//        list.sort(new Comparator<Client>() {
//            @Override
//            public int compare(Client o1, Client o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        for (Client client : list) {
//            System.out.println(client);
//        }
    }
    }
