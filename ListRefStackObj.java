import java.util.List;
import java.util.Stack;

public class ListRefStackObj {
    public static void main(String[] args) {

        System.out.println("--- List Reference to Stack Object ---\n");

        // 1. Create a List reference pointing to a Stack object in memory
        List<String> taskList = new Stack<>();

        // 2. Because the REFERENCE is a List, we can only use List methods.
        // We CANNOT use taskList.push() or taskList.pop() here!
        taskList.add("Learn Core Java"); // List.add(E e)
        taskList.add("Learn Collections");
        taskList.add("Learn Spring Boot");

        System.out.println("taskList = " + taskList);

        // 3. We can use standard List methods to retrieve data
        System.out.println(
            "\nElement at index 1: " + taskList.get(1) // List.get(int index)
        );

        // 4. DOWNCASTING: If we suddenly need to use Stack-specific methods,
        // we must temporarily tell Java to treat the reference as a Stack again.
        String topItem = ((Stack<String>) taskList).peek(); // Stack.peek()

        System.out.println("\nStack top item: " + topItem);
    }
}
