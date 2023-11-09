package homework.chapter13;

import java.io.*;

public class StudentDemo {

    public static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\chapter13\\test\\folder1\\example.txt";


    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Student student = new Student("Poxos", "Poxosyan", 20, "poxos@mail.ru");
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
//            objectOutputStream.writeObject(student);
//        }
//
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object object = objectInputStream.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }
        }
    }
}
