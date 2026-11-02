import java.util.ArrayList;

public class CollectionUsingExample {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Jagannath");
        names.add("Rath");
        names.add("Yatra");  

        // Printing elements
        System.out.println(names);

        // Accessing element
        System.out.println(names.get(1));

        // Removing element
        names.remove("Ravi");

        // Printing updated list
        System.out.println(names);

    }
}
