package week1.bt1;


import java.util.Map;
import java.util.Scanner;

class WordCharacter2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your content: ");
        String input = scanner.nextLine();

        WordCharacter2 analyzer = new WordCharacter2(input);

        Map<String, Integer> wordCount = analyzer.getWordCharacterCount();
        Map<Character, Integer> charCount = analyzer.getCharacterCount();

        System.out.println(wordCount);
        System.out.println(charCount);
    }
}

