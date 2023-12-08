package homework.other;

import org.jetbrains.annotations.NotNull;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Objects;

public class Client{

    String name;
    String surname;
    String email;
    int age;
    Date registerDate;

    public Client() {
    }

    public Client(String name, String surname, String email, int age,  Date registerDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (age != client.age) return false;
        if (!Objects.equals(name, client.name)) return false;
        if (!Objects.equals(surname, client.surname)) return false;
        if (!Objects.equals(email, client.email)) return false;
        return Objects.equals(registerDate, client.registerDate);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", registerDate=" + registerDate +
                '}';
    }

//    @Override
//    public int compareTo(Client o) {
//        if (o.age > age) {
//            return 1;
//        } else if (o.age < age) {
//            return -1;
//        } else {
//            return 0;
//        }
//
//    }
}
