package homework.chapter5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("до возврата");
        if (t) return;
        System.out.println("не выполняеться");
    }
}
