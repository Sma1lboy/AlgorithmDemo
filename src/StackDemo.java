import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(21);
        stack.pop();
        System.out.println(stack);
        Queue<Integer> queue = new LinkedList<>();

    }
}
