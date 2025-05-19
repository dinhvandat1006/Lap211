package week1.bt1;

import java.util.Map;

public class  WordCharacter2 {
    private String n;

    public WordCharacter2(String n) {
        this.n = n;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public Map<String, Integer> getWordCharacterCount() {
        String[] words =n.split(" ");
        Map<String, Integer> wordCountMap = new java.util.HashMap<>();

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!cleanedWord.isEmpty()) {
                wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        return wordCountMap;
    }

    public Map<Character, Integer> getCharacterCount() {
        Map<Character, Integer> charCountMap = new java.util.HashMap<>();
        for (char c : n.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerC = Character.toLowerCase(c);
                charCountMap.put(lowerC, charCountMap.getOrDefault(lowerC, 0) + 1);
            }
        }
        return charCountMap;
    }
}