import java.util.ArrayList;

public class CollectionUsingExample {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Jagannath");
        names.add("Rath");
        names.add("Yatra");  

        // Printing elements
        System.out.println("1. Printing elements:"+names);

        // Accessing element
        System.out.println("2. Accessing element:"+names.get(1));

        // Removing element
        names.remove("Rath");

        // Printing updated list
        System.out.println("3. Printing updated list:"+ names);

    }
}
