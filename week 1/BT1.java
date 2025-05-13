import java.util.*;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo Scanner

        // Nhập chuỗi từ người dùng
        System.out.print("Enter your content:\n");
        String input = scanner.nextLine();

        // Đếm số lượng từ
        StringTokenizer tokenizer = new StringTokenizer(input);
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Đếm ký tự
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : input.replace(" ", "").toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // In kết quả
        System.out.println(wordCount);
        System.out.println(charCount);
    }
}
