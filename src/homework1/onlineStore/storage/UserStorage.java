package homework1.onlineStore.storage;

import homework1.onlineStore.model.User;
import homework1.onlineStore.types.UserType;

public class UserStorage {

    private User[] users = new User[10];
    private int size;

    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    public User getUserEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    public User getUserEmailAndPassword(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)&&users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }


    private void extend() {
        User[] temp = new User[users.length + 10];
        System.arraycopy(users, 0, temp, 0, users.length);
        users = temp;
    }
}

