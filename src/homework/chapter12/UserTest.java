package homework.chapter12;

public class UserTest {
    public static void main(String[] args) {
        //  String lang = "hy";//Scanner.nextLine();

        //  Language language =  Language.valueOf(lang.toUpperCase());//valueOf() Convert String to enum
        //  User user = new User("Poxos","Poxosyan","poxos@mail.ru",language);
        //  User user1 = new User("Petros","Petrosyan","petros@mail.ru",Language.RU);

        // String lang = user.getLang().name();//name() Convert enum to String

        // System.out.println(user);
        //  System.out.println(user1);

        Language[] values = Language.values();//values() Print enums all arguments
        for (Language value : values) {
            System.out.println(value + " " + value.getLanguageName() + " " +
                    value.ordinal());//ordinal() index
        }
    }
}

