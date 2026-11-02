import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        
        names.add("Jagannath");
        names.add("Rath");
        names.add("Yatra");

        // Printing elements
        System.out.println("1. Printing elements:" +names);

        // Accessing element
        System.out.println("2. Accessing element: "+names.get(1));

        // Adds an element
        names.add("Chariot");
        System.out.println("3. Printing elements after adding:" + names);
        // Adding an element at a specific index
        names.add(1, "Festival");
        System.out.println("4. Printing elements after adding at specific index:" + names); 
        // Adding null element
        names.add(null);
        System.out.println("5. Printing elements after adding null:" + names);
        // Adding duplicate element
        names.add("Jagannath");
        System.out.println("6. Printing elements after adding duplicate:" + names);
        // Adding an element at the beginning of the list
        names.addFirst("India");
        System.out.println("7. Printing elements after adding at the beginning:" + names);
        // Adding an element at the end of the list
        names.addLast("World");
        System.out.println("8. Printing elements after adding at the end:" + names);

        // Getting the first element
        System.out.println("9. Getting the first element: " + names.getFirst());
        // Getting the last element
        System.out.println("10. Getting the last element: " + names.getLast());
        // Getting the element at a specific index
        names.get(4);
        System.out.println("11. Getting the element at index 4: " + names.get(4));

        // Updates an element
        names.set(2, "Temple");
        System.out.println("12. Printing elements after updating:" + names);
        // Updates an element at a specific index
        names.set(3, "Festival");
        System.out.println("13. Printing elements after updating at specific index:" + names);

        // Getting the size of the list
        System.out.println("14. Getting the size of the list: " + names.size());
        // Checking if the list is empty
        System.out.println("15. Checking if the list is empty: " + names.isEmpty());
        // Checking if the list contains a specific element
        System.out.println("16. Checking if the list contains 'Temple': " + names.contains("Temple"));

        // Removing an element
        names.remove("Yatra");
        System.out.println("17. Printing elements after removal:" + names);
        // Removing an element at a specific index
        names.remove(2);
        System.out.println("18. Printing elements after removal at specific index:" + names);   
        // Removing the first element
        names.removeFirst(); 
        System.out.println("19. Printing elements after removing the first element:" + names);   
        // Removing the last element
        names.removeLast();  
        System.out.println("20. Printing elements after removing the last element:" + names);   
        // Removing all elements
        names.removeAll(names);
        System.out.println("21. Printing elements after removing all elements:" + names);
        
        // Clearing the list
        names.clear();   
        System.out.println("22. Printing elements after clearing the list:" + names);
    }
}
