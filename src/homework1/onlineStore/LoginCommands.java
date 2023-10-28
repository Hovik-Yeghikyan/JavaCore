package homework1.onlineStore;

public interface LoginCommands {
    String LOGIN = "0";
    String REGISTER = "1";


    static void printLoginCommands() {
        System.out.println("Please input " + LOGIN + " for login");
        System.out.println("Please input " + REGISTER + " for register");
    }
}
