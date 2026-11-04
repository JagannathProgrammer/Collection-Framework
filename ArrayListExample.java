

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        // // Adding elements
        name.add("Jagannath");
        name.add("Rath");
        name.add("Yatra");  

        // Printing elements
        System.out.println("1. Printing elements:" +name);

        // Accessing element
        System.out.println("2. Accessing element: "+name.get(1));

        // Adds an element
        name.add("Chariot");
        System.out.println("3. Printing elements after adding:" + name);
        // Adding an element at a specific index
        name.add(1, "Festival");
        System.out.println("4. Printing elements after adding at specific index:" + name); 
        // Adding null element
        name.add(null);
        System.out.println("5. Printing elements after adding null:" + name);
        // Adding duplicate element
        name.add("Jagannath");
        System.out.println("6. Printing elements after adding duplicate:" + name);
        // Adding an element at the beginning of the list
        name.addFirst("India");
        System.out.println("7. Printing elements after adding at the beginning:" + name);
        // Adding an element at the end of the list
        name.addLast("World");
        System.out.println("8. Printing elements after adding at the end:" + name);

        // Getting the first element
        System.out.println("9. Getting the first element: " + name.getFirst());
        // Getting the last element
        System.out.println("10. Getting the last element: " + name.getLast());
        // Getting the element at a specific index
        name.get(4);
        System.out.println("11. Getting the element at index 4: " + name.get(4));

        // Updates an element
        name.set(2, "Temple");
        System.out.println("12. Printing elements after updating:" + name);
        // Updates an element at a specific index
        name.set(3, "Festival");
        System.out.println("13. Printing elements after updating at specific index:" + name);

        // Getting the size of the list
        System.out.println("14. Getting the size of the list: " + name.size());
        // Checking if the list is empty
        System.out.println("15. Checking if the list is empty: " + name.isEmpty());
        // Checking if the list contains a specific element
        System.out.println("16. Checking if the list contains 'Temple': " + name.contains("Temple"));

        // Removing an element
        name.remove("Yatra");
        System.out.println("17. Printing elements after removal:" + name);
        // Removing an element at a specific index
        name.remove(2);
        System.out.println("18. Printing elements after removal at specific index:" + name);   
        // Removing the first element
        name.removeFirst(); 
        System.out.println("19. Printing elements after removing the first element:" + name);   
        // Removing the last element
        name.removeLast();  
        System.out.println("20. Printing elements after removing the last element:" + name);   
        // Removing all elements
        name.removeAll(name);
        System.out.println("21. Printing elements after removing all elements:" + name);
        
        // Clearing the list
        name.clear();   
        System.out.println("22. Printing elements after clearing the list:" + name);

        // capacity of the array list
        name.ensureCapacity(10);
        System.out.println("23. Capacity of the array list: " + name.size());
    }
}
