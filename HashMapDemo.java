import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>(
            Map.of(
                101, "Alice",
                102, "Bob"
            )
        );

        employees.put(103, "Charlie");

        System.out.println("Employees map: " + employees);
        System.out.println("Employees map size: " + employees.size() + "\n");

        employees.putIfAbsent(103, "David"); // ignored
        employees.putIfAbsent(104, "Eve"); // added

        System.out.println("Employees map: " + employees);
        System.out.println("Employees map size: " + employees.size() + "\n");

        System.out.println("Employee 102: " + employees.get(102));
        System.out.println("Employee 999: " + employees.getOrDefault(999, "Not Found"));
        System.out.println("Contains key 105?: " + employees.containsKey(105));
        System.out.println("Contains value 'Alice'?: " + employees.containsValue("Alice"));
        System.out.println();

        System.out.println("Employees Map:-");
        for (Map.Entry<Integer, String> employee : employees.entrySet()) {
            System.out.print("ID: " + employee.getKey());
            System.out.println(", Name: " + employee.getValue());
        }
        System.out.println();

        employees.put(101, "Smith");
        employees.replace(102, "Johnson");
        System.out.println("Updated 101 and 102 employee data.\n");

        System.out.println("Employees map: " + employees + "\n");

        String removedEmployee = employees.remove(104);
        System.out.println("Removed Employee 104: " + removedEmployee);
        boolean isRemoved = employees.remove(103, "Charlie");
        System.out.println("Was Charlie removed?: " + isRemoved + "\n");

        System.out.println("Employees map: " + employees + "\n");

        employees.clear();
        System.out.println("After clear() - Is empty?: " + employees.isEmpty());
    }
}



// Output:-
// Employees map: {101=Alice, 102=Bob, 103=Charlie}
// Employees map size: 3
// Employees map: {104=Eve, 101=Alice, 102=Bob, 103=Charlie}
// Employees map size: 4

// Employee 102: Bob
// Employee 999: Not Found
// Contains key 105?: false
// Contains value 'Alice'?: true
