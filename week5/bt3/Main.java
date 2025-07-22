package week5.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        String num1 = sc.nextLine();

        System.out.print("Nhập số thứ hai: ");
        String num2 = sc.nextLine();

        BigNumber a = new BigNumber(num1);
        BigNumber b = new BigNumber(num2);

        BigNumber sum = a.add(b);
        BigNumber product = a.multiply(b);

        System.out.println("Tổng: " + sum);
        System.out.println("Tích: " + product);
    }
}

