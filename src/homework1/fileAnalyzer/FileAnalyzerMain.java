package homework1.fileAnalyzer;

import java.io.IOException;

public class FileAnalyzerMain {
    public static void main(String[] args) throws IOException {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        String filePath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework1\\fileAnalyzer\\file.txt";
        System.out.println(fileAnalyzer.wordMap(filePath));
        System.out.println("total count of words: " + fileAnalyzer.totalWordCount(filePath));
        System.out.println("unique count of words: " + fileAnalyzer.uniqueWordCount(filePath));
        System.out.println("top Frequent Words is: " + fileAnalyzer.topFrequentWords(filePath, 3));
        System.out.println("count Word Occurrences is: " + fileAnalyzer.countWordOccurrences(filePath, "Hello"));
    }
}
