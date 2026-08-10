import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> stations = new LinkedList<>(
            List.of(
                "Station B",
                "Station C"
            )
        );

        System.out.println("stations = " + stations + "\n");

        stations.add("Station D");

        System.out.println("stations = " + stations + "\n");

        stations.addFirst("Station A");
        stations.addLast("Station E");

        System.out.println("stations = " + stations + "\n");

        System.out.print("current route:");
        for (String station : stations) {
            System.out.print(" <=> " + station);
        }
        System.out.println();

        System.out.println("Total Stations: " + stations.size() + "\n");

        System.out.println("First station : " + stations.peekFirst());
        System.out.println("Last station  : " + stations.peekLast());
        System.out.println();

        System.out.println("Station at index 2: " + stations.get(2) + "\n");

        String oldValue = stations.set(2, "Station C (Under Construction)");

        System.out.println("Replaced '" + oldValue + "' with 'Station C (Under Construction)' at index 2.");
        System.out.println("stations = " + stations + "\n");

        String removedFirst = stations.pollFirst();
        String removedLast = stations.pollLast();

        System.out.println("Removed first station : " + removedFirst);
        System.out.println("Removed last station  : " + removedLast);
        System.out.println("stations = " + stations + "\n");

        String removedNode = stations.remove(1);
        System.out.println("Removed station at index 1: " + removedNode);

        System.out.println("stations = " + stations + "\n");
    }
}
