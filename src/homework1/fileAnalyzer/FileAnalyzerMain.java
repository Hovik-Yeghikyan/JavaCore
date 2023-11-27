package homework1.fileAnalyzer;

import java.io.IOException;

public class FileAnalyzerMain {
    public static void main(String[] args) throws IOException {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        String filePath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework1\\fileAnalyzer\\file.txt";
        System.out.println(fileAnalyzer.wordMap(filePath));
    }
}
