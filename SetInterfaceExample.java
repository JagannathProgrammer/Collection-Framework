import java.util.Set;
import java.util.HashSet;
public class SetInterfaceExample {
    public static void main(String[] args) {
        // Create Set
        Set<String> Names = new HashSet<>();

        // Add Elements
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");
        Names.add("Amit");
        Names.add("Ram");

        // Display Elements
        System.out.println("Set Elements:");
        System.out.println(Names);

        // Find Size
        System.out.println("Size: " + Names.size());

    }
}