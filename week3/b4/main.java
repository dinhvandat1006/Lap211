package week3.b4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Top value: " + stack.get());
        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        sc.close();
    }
}
