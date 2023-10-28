package homework1.onlineStore;

import homework1.onlineStore.model.User;
import homework1.onlineStore.storage.ProductStorage;
import homework1.onlineStore.storage.UserStorage;
import homework1.onlineStore.types.UserType;

import java.util.Scanner;

public class OnlineStoreMain implements LoginCommands {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductStorage productStorage = new ProductStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {
           boolean isRun  = true;
           while (isRun){
               LoginCommands.printLoginCommands();
               String logCommand = scanner.nextLine();
               switch (logCommand){
                   case LOGIN ->{

                   }
                   case REGISTER -> {
                       addUsers();
                   }
               }
           }

    }

    private static void addUsers() {
        System.out.println("Please input User id");
        String id = scanner.nextLine();
        System.out.println("Please input User name");
        String name = scanner.nextLine();
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please create password");
        String password = scanner.nextLine();
        System.out.println("Please input type: ADMIN OR USER");
        String type = scanner.nextLine();
        UserType type1 = UserType.valueOf(type.toUpperCase());
        User user = new User(id,name,email,password,type1);
        System.out.println("User created");
        System.out.println(user);

    }
}
