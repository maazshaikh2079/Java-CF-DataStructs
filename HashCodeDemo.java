import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // INDUSTRY STANDARD: The Hash Function
    // We tell Java to generate the integer based on the 'id' and 'name' fields,
    // rather than the random memory address of the object.
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // INDUSTRY STANDARD: The Collision Checker
    // If two objects happen to generate the same HashCode, a HashMap will call
    // equals() to guarantee they are actually the same data.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class HashCodeDemo {
    public static void main(String[] args) {

        // 1. We create two completely separate objects in memory that hold the EXACT same data.
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(101, "Alice");

        // This is false because 'new' created two different physical objects in RAM
        System.out.println("Are they the exact same object in memory (student1 == student2)?: " + (student1 == student2));
        System.out.println();

        // Because we properly overrode hashCode(), they generate the exact same integer!
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
        System.out.println();

        Map<Student, String> studentGrades = new HashMap<>();

        // We store the grade in the HashMap using student1 as the key
        studentGrades.put(student1, "A+");
        System.out.println("Grade 'A+' saved into Map using student1.\n");

        // We attempt to retrieve the grade using student2!
        // Because student2 generates the exact same hashcode as student1, the HashMap knows
        // exactly which memory bucket to look in.
        String retrievedGrade = studentGrades.get(student2);

        System.out.println("Retrieved grade using student2: " + retrievedGrade);

        /*
         * CRITICAL NOTE: If you delete the hashCode() and equals() methods from the
         * Student class and run this again, 'retrievedGrade' will be null!
         * Java wouldn't know they were supposed to be the same key.
         */
    }
}

// Output:
// Are they the exact same object in memory (student1 == student2)?: false

// student1 hashCode: 63354460
// student2 hashCode: 63354460

// Grade 'A+' saved into Map using student1.

// Retrieved grade using student2: A+
