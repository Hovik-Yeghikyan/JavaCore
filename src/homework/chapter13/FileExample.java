package homework.chapter13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String newfilePath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\chapter13\\test\\notes1234.txt";
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\chapter13\\test","123.txt");

//        File directory1 = new File(newfilePath + "a");
//        directory1.mkdir();
//        File directory2 = new File(newfilePath + "b");
//        directory2.mkdir();
//        File directory3 = new File(newfilePath + "c");
//        directory3.mkdir();
//        System.out.println(file);
//        if (!file.exists()) {
//            System.out.println(file.mkdirs());
//
//        }


//        boolean result = file.renameTo(new File(newfilePath));
//        System.out.println("result" + ":"  + result);
//        System.out.println(file.getTotalSpace());
//      //  System.out.println(file.getUsableSpace());
//        System.out.println(file.getFreeSpace());
//        File parent = file.getParentFile();
//   String parentOfparent = parent.getParent();
//     //   System.out.println(parent);
//        System.out.println(parentOfparent);

//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("deleted");
//            }
//
//        }
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//                System.out.println("File created");
//            } catch (IOException e) {
//                System.out.println("Cannot create file " + e);
//            }
//        }else {
//            System.out.println("File not created");
//        }
//
//        System.out.println(file.exists());

//        System.out.println(file.isDirectory());//file.isFile

//        if (file.isDirectory()) {
//            File[] list = file.listFiles();
//            for (File f : list) {
//                if (f.isFile()) {
//                    System.out.println(f.getName() + " " + f.getAbsolutePath() + " " + f.length() + " " +
//                          new Date(f.lastModified()) + " " + f.canWrite());
//                }
//            }
//        }
    }
}
