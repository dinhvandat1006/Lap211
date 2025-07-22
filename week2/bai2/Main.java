package week2.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter operator (+, -, *, /, ^): ");
                    char op = sc.next().charAt(0);
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();

                    Calculator calc = new Calculator(a, b, op);
                    System.out.println("Result: " + calc.calculate());
                }
                case 2 -> {
                    System.out.print("Enter weight (kg): ");
                    double weight = sc.nextDouble();
                    System.out.print("Enter height (m): ");
                    double height = sc.nextDouble();

                    BMIInfo bmi = new BMIInfo(weight, height);
                    System.out.printf("BMI: %.2f (%s)%n", bmi.calculateBMI(), bmi.getBMIStatus());
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

