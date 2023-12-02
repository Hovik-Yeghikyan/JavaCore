package homework1.fileAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {

    // Читаем файл, составляем мапу слово-количество и возвращаем ее
    public Map<String, Integer> wordMap(String path) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.replaceAll(",", " ").
                        replaceAll(":", " ").
                        replaceAll("\\.", " ")
                        .replaceAll(";", " ")
                        .split(" ");
                for (String word : words) {
                    if (!word.trim().isEmpty()) {
                        if (map.containsKey(word)) {
                            Integer count = map.get(word);
                            map.put(word, ++count);
                        } else {
                            map.put(word, 1);
                        }
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
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            Map.Entry<String, Integer> stringIntegerEntry = entries.get(i);
            resultMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
        return resultMap;
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