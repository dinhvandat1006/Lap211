package week3.b4;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stackValues;

    public Stack() {
        stackValues = new ArrayList<>();
    }

    public void push(int value) {
        stackValues.add(value);
    }

    public int pop() {
        if (!stackValues.isEmpty()) {
            return stackValues.remove(stackValues.size() - 1);
        }
        throw new RuntimeException("Stack is empty");
    }

    public int get() {
        if (!stackValues.isEmpty()) {
            return stackValues.get(stackValues.size() - 1);
        }
        throw new RuntimeException("Stack is empty");
    }

    public boolean isEmpty() {
        return stackValues.isEmpty();
    }

    public void printStack() {
        System.out.println("Stack: " + stackValues);
    }
}

