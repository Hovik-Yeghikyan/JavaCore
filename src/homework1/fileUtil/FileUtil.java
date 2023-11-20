package homework1.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
           fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input the name of the file you want to find");
        String filename = scanner.nextLine();
        File file = new File(path, filename);
        System.out.println(file.exists());

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        File[] list = file.listFiles();
        if (list != null) {
            for (File f : list) {
                if (f.isFile() && f.getName().contains(keyword)) {
                    System.out.println(f.getName());
                }
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(lineNumber + " " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        long size = 0;
        File[] list = file.listFiles();
        if (list != null) {
            for (File f : list) {
                size = size + f.length();
            }
        }
        System.out.println("Files total size is: " + size + " byte");

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent(){
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input filename you want to create");
        String fileName = scanner.nextLine();
        System.out.println("Please input content for file");
        String content = scanner.nextLine();
       File file = new File(path,fileName);
       try(FileWriter fileWriter = new FileWriter(file)) {
           fileWriter.write(content);
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}


