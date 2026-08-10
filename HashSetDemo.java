import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {

        // CREATE READ
        Set<String> vehicles = new HashSet<>(
            List.of(
                "Car",
                "Truck",
                "Motorcycle"
            )
        );

        System.out.println("vehicles = " + vehicles + "\n");

        // Attempting to add a duplicate element
        boolean flag = vehicles.add("Car");  // Set.add(E e): return boolean;
        System.out.println("Was duplicate 'Car' added?: " + flag);
        System.out.println();

        System.out.println("vehicles = " + vehicles);
        System.out.println("Total vehicles: " + vehicles.size()); // Set.size()
        System.out.println();

        System.out.println("Contains 'Truck': " + vehicles.contains("Truck"));
        System.out.println("Contains 'Bus': " + vehicles.contains("Bus"));
        System.out.println();

        System.out.println("Vehicles:");
        for (String vehicle : vehicles) {
            System.out.println(" - " + vehicle);
        }
        System.out.println();

        // UPDATE DELETE
        // HashSet does not have indexes. To "update", you remove the old and add the new.

        flag = vehicles.remove("Motorcycle"); // Set.remove(Object o): return boolean;
        System.out.println("Removed 'Motorcycle': " + flag);

        flag = vehicles.add("Bicycle");
        System.out.println("Removed 'Bicycle': " + flag);

        System.out.println("vehicles = " + vehicles + "\n");

        vehicles.clear();
        System.out.println("After clear() - Is empty?: " + vehicles.isEmpty());
    }
}
