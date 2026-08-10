import java.util.Arrays;

public class Array1D {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println();

        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println("\n");

        Arrays.stream(colors).forEach(System.out::println);
        System.out.println();

        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i] + " ");
        }
        System.out.println("\n");

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.print(colors[i] + " ");
        }
        System.out.println("\n\n------------------------\n");

        int[] nums = {32, 23, 45};

        System.out.println(Arrays.toString(nums) + "\n");

        System.out.println(nums.length);

    }
}
