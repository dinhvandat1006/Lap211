package week1.bt1;



import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

    public class WordCharacterCounter {
        private String content;t

        public WordCharacterCounter(String content) {
            this.content = content;
        }

        public Map<String, Integer> getWordCount() {
            Map<String, Integer> wordCount = new HashMap<>();
            StringTokenizer tokenizer = new StringTokenizer(content);

            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken().toLowerCase();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            return wordCount;
        }

        public Map<Character, Integer> getCharacterCount() {
            Map<Character, Integer> charCount = new HashMap<>();

            for (char c : content.toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                }
            }

            return charCount;
        }
    }



