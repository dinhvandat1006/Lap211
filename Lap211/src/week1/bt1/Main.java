package week1.bt1;

import java.util.*;
import week1.bt1.ContentAnalyzer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your content:\n");
        String input = sc.nextLine();

        ContentAnalyzer analyzer = new ContentAnalyzer(input);

        // Lấy dữ liệu
        Map<String, Integer> wordCount = analyzer.countWords();
        Map<Character, Integer> charCount = analyzer.countCharacters();

        // In word count
        System.out.print("{");
        int i = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
            if (++i < wordCount.size()) System.out.print(", ");
        }
        System.out.println("}");

        // In character count
        System.out.print("{");
        int j = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
            if (++j < charCount.size()) System.out.print(", ");
        }
        System.out.println("}");
    }
}
