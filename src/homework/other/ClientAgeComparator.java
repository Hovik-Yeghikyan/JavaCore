package homework.other;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class ClientAgeComparator implements Comparator<Client> {


    @Override
    public int compare(Client o1, Client o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
