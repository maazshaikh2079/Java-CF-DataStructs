import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListNArrayList {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("red");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println();

        colors = new ArrayList<>(List.of("blue", "purple", "yellow"));
        // or
        // colors = new ArrayList<>(List.of(new String[]{"blue", "purple", "yellow"}));

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println();

        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println();

        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println("\n");

        colors.forEach(System.out::println);
        System.out.println();

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println("\n");

        colors = new LinkedList<>();

        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors + "\n");

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println("\n");

        List<String> unmodifiableColors = List.of("blue", "yellow");

        // colorsUnmodifiable.add("pink"); // Throws UnsupportedOperationException at runtime

        System.out.println(unmodifiableColors);
    }
}
