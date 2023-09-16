import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    private final Queue<Integer> stack = new ArrayDeque<>();

    public void push(int element) {
        stack.add(element);
        for (int i = 0; i < stack.size() - 1; i++) {
            stack.add(stack.poll());
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.poll();
        }
    }

    public int findMax() {
        Queue<Integer> tempStack = stack;
        if (tempStack.isEmpty()){
            return -1;
        } else {
            int max = tempStack.peek();
            tempStack.add(tempStack.poll());
            for (int i = 0; i < tempStack.size(); i++) {
                if (max > tempStack.peek()) {
                    tempStack.add(tempStack.poll());
                } else {
                    max = tempStack.peek();
                    tempStack.add(tempStack.poll());
                }
            }
                return max;
            }
        }



    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }
}
