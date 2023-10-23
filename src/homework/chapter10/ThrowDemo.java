package homework.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e) {
            System.out.println("the exception is caught in the body of the " + "method demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("repeated interception: " + e);
        }
    }
}
