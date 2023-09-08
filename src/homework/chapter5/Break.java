package homework.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшестует оператору break. ");
                    if (t) {
                        break second;
                    }
                    System.out.println("not supported");
                }
                System.out.println("не выполняется");
            }
            System.out.println("следует за оператором second");
        }

    }
}

