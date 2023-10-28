package homework1.onlineStore.storage;

import homework1.onlineStore.model.User;

public class UserStorage {

    private User[] users = new User[10];
    private int size;

    public void add(User user) {
        if (size == users.length) {
            extand();
        }
        users[size++] = user;
    }

    private void extand() {
        User[] temp = new User[users.length + 10];
        System.arraycopy(users, 0, temp, 0, users.length);
        users = temp;
    }
}

