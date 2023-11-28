package homework1.fileAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileAnalyzer {

    // Читаем файл, составляем мапу слово-количество и возвращаем ее
    public Map<String, Integer> wordMap(String path) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int value = 1;
                String[] words = line.split(" ");
                for (String word : words) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    // Читаем файл, подсчитываем общее количество слов
    public int totalWordCount(String path) {
        Map<String, Integer> map = wordMap(path);
        int totalCount = 0;
        for (Integer value : map.values()) {
            totalCount = totalCount + value;
        }
        return totalCount;
    }

    // Читаем файл, подсчитываем количество уникальных слов
    public int uniqueWordCount(String path) {

        Map<String, Integer> map = wordMap(path);
        int uniqueCount = 0;
        for (Integer value : map.values()) {
            if (value == 1) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }


    // Читаем файл, находим топ-N часто встречающихся слов
    public Map<String, Integer> topFrequentWords(String path, int n) {
        Map<String, Integer> map = wordMap(path);
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() >= n) {
                newMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            }
        }
        return newMap;

    }

    // Читаем файл, находим количество вхождений слова и возвращаем это число
    public int countWordOccurrences(String path, String word) {
        Map<String, Integer> map = wordMap(path);
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getKey().equals(word)) {
                return stringIntegerEntry.getValue();
            }
        }
        return 0;
    }

}