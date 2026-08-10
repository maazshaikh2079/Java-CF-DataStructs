import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class QueueDemo {

    static record Person(String name, int age){}

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(
            List.of(
                new Person("Mario", 17),
                new Person("Alex", 21)
            )
        );

        System.out.println("queue = " + queue);
        System.out.println("queue size: " + queue.size());
        System.out.println();

        queue.add(new Person("Shaan", 33));
        queue.add(new Person("James", 55));

        System.out.println("queue = " + queue);
        System.out.println("queue size: " + queue.size());
        System.out.println();

        System.out.println("Queue: ");
        for(Person p : queue) {
            System.out.println(p);
        }
        System.out.println();

        // Object[] queueArray = queue.toArray();

        System.out.println("Queue (as array): ");
        for(int i = 0; i < queue.size(); i++) {
            System.out.printf("[Index %d] -> %s\n", i, queue.toArray()[i].toString());
        }
        System.out.println();

        System.out.println("First in queue : " + queue.peek());
        System.out.println("Last in queue  : " + queue.toArray()[queue.size() - 1]);
        System.out.println();

        System.out.println("Polled from queue : " + queue.poll());
        System.out.println("Offered to queue  : " + queue.offer(new Person("Juan", 43)));
        System.out.println("queue = " + queue);
        System.out.println();
    }
}
