import java.util.Stack;
import java.util.List;

public class StackDemo {
    public static void main(String[] args) {
        // Create and Read
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(22, 53)); // Vector.addAll(Collection<? extends E> c): returns true or false;

        System.out.println("stack = " + stack); // stack = [22, 53]
        System.out.println(
            "stack size: " + stack.size() // Vector.size(): return elementCount;
        ); // stack size: 2
        System.out.println();

        stack.push(44); // Stack.push(E item): return item;
        stack.push(65);
        stack.add(33); // Vector.add(E element): return true;
        stack.add(1, 82); // Vector.add(int index, E element)

        System.out.println("stack = " + stack); // stack = [22, 82, 53, 44, 65, 33]
        System.out.println("stack size: " + stack.size()); // stack size: 6
        System.out.println();

        System.out.println("stack: ");
        for (Integer item : stack) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println("index: " + i + ", element: " + stack.get(i));
        }
        System.out.println();

        System.out.println("Top element (Peek): " + stack.peek());
        System.out.println("Element at index 1: " + stack.get(1));
        System.out.println("Position of 65 from the top: " + stack.search(65));
        System.out.println("Position of 11 from the top: " + stack.search(11));
        System.out.println();

        // Update
        int oldValue = stack.set(2, 99); // Vector.set(int index, E element): returns oldValue;
        System.out.println("Replaced " + oldValue + " with 99 at index 2 in stack");
        System.out.println("stack = " + stack + "\n");

        // Delete
        int removedTopElement = stack.pop(); // Stack.pop(): returns obj;
        System.out.println("Element removed from top: " + removedTopElement);
        System.out.println("stack = " + stack + "\n");

        boolean isRemoved = stack.remove(Integer.valueOf(82)); // Vector.remove(Object o): returns true or false;
        System.out.println("Removed 82 from stack: " + isRemoved);
        System.out.println("stack = " + stack + "\n");

        int removedElement = stack.remove(1); // Vector.remove(int index): returns oldValue;
        System.out.println("Element removed at index 1: " + removedElement);
        System.out.println("stack = " + stack + "\n");
    }
}
