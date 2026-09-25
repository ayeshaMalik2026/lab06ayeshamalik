package lab6;

import java.util.ArrayList;

public class ArrayStack {
    private final ArrayList<Integer> stack = new ArrayList<>();

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
