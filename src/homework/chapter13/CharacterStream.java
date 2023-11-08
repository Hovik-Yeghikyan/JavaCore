package homework.chapter13;

import java.io.*;

public class CharacterStream {

    public static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\chapter13\\test\\folder1\\example.txt";


    public static void main(String[] args) throws IOException {
        //  write();
        read();
    }

    public static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < 1000; i++) {
                bw.write("Hello from Java");
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            int lineNumber = 1;
//            while ((line = bufferedReader.readLine()) != null) {
//              System.out.println(lineNumber++ + " " + line);
            //       }
            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

