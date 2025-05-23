package week2.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m1, m2;
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        m1 = inputMatrix(sc, rows, cols, "Matrix 1");
        m2 = inputMatrix(sc, rows, cols, "Matrix 2");

        while (true) {
            System.out.println("\n--- Matrix Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> MatrixCalculator.add(m1, m2).display();
                    case 2 -> MatrixCalculator.subtract(m1, m2).display();
                    case 3 -> MatrixCalculator.multiply(m1, m2).display();
                    case 4 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static Matrix inputMatrix(Scanner sc, int rows, int cols, String name) {
        Matrix m = new Matrix(rows, cols);
        System.out.println("Enter values for " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    System.out.printf("Value [%d][%d]: ", i, j);
                    if (sc.hasNextDouble()) {
                        m.setValue(i, j, sc.nextDouble());
                        break;
                    } else {
                        System.out.println("Values of matrix must be a number.");
                        sc.next(); // bỏ giá trị sai
                    }
                }
            }
        }
        return m;
    }
}

