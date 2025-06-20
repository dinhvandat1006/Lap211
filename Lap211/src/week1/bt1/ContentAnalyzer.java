package week1.bt1;

import java.util.*;

public class ContentAnalyzer {
    private String content;

    // Constructor
    public ContentAnalyzer(String content) {
        this.content = content;
    }

    // Getter
    public String getContent() {
        return content;
    }

    // Setter
    public void setContent(String content) {
        this.content = content;
    }

    // Đếm số lần xuất hiện của mỗi từ

public Map<String, Integer> countWords(){
        Map<String,Integer> wordCount = new LinkedHashMap<>();
        String[] words = content.trim().split("\\s+");
        for(String word : words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
}



    // Đếm số lần xuất hiện của mỗi ký tự (loại bỏ dấu cách)
    public Map<Character, Integer> countCharacters() {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : content.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        return charCount;
    }


    public void displayResults() {
        System.out.println("\n{");
    }
}


