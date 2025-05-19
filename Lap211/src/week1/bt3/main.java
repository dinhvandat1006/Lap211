package week1.bt3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose input base (2 = Binary, 10 = Decimal, 16 = Hexadecimal): ");
            int input = scanner.nextInt();
            System.out.println("Choose output base (2 = Binary, 10 = Decimal, 16 = Hexadecimal): ");
            int output = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            System.out.print("Enter input value: ");
            String value = scanner.nextLine();

            ConvertNumber converter = new ConvertNumber(input, output, value);
            try {
                String result = converter.convert();
                System.out.println("Converted result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input value for base " + input);
            }

            System.out.print("Do you want to convert again? (y/n): ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("y")) break;
        }
        scanner.close();
    }
}

