
import java.util.Arrays;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
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
        names.add(0, "India");
        System.out.println("7. Printing elements after adding at the beginning:" + names);  

        // Adding an element at the end of the list
        names.add("World");
        System.out.println("8. Printing elements after adding at the end:" + names);    

        // Getting the first element
        System.out.println("9. Getting the first element: " + names.firstElement());    

        // Getting the last element
        System.out.println("10. Getting the last element: " + names.lastElement()); 

        // Getting the element at a specific index
        System.out.println("11. Getting the element at index 4: " + names.get(4));  
            
        // Updates an element
        names.set(2, "Temple"); 
        System.out.println("12. Printing elements after updating element at index 2: " + names);    

        // Updates an element at a specific index
        names.set(3, "Festival");   
        System.out.println("13. Printing elements after updating element at index 3: " + names);    

        // Getting the size of the list
        System.out.println("14. Getting the size of the list: " + names.size());    

        // Checking if the list is empty
        System.out.println("15. Checking if the list is empty: " + names.isEmpty());    

        // Checking if the list contains a specific element
        System.out.println("16. Checking if the list contains 'Temple': " + names.contains("Temple"));  

        // Removing an element
        names.remove("Yatra");
        System.out.println("17. Printing elements after removing 'Yatra': " + names);   

        // Removing an element at a specific index
        names.remove(2);
        System.out.println("18. Printing elements after removing element at index 2: " + names);

        // Removing the first element
        names.remove(0);    
        System.out.println("19. Printing elements after removing the first element: " + names);

        // Removing the last element
        names.remove(names.size() - 1);
        System.out.println("20. Printing elements after removing the last element: " + names);  

        // Clearing the list
        names.clear();  
        System.out.println("21. Printing elements after clearing the list: " + names);  

        // capacity of the vector
        System.out.println("22. Capacity of the vector: " + names.capacity());

        // Ensuring capacity of the vector
        names.ensureCapacity(10);   
        System.out.println("23. Capacity of the vector after ensuring capacity: " + names.capacity());  

        // Trimming the capacity of the vector
        names.trimToSize();
        System.out.println("24. Capacity of the vector after trimming: " + names.capacity());

        // Getting the size of the vector
        System.out.println("25. Size of the vector: " + names.size());  
        
        // Checking if the vector is empty
        System.out.println("26. Checking if the vector is empty: " + names.isEmpty());

        // Checking if the vector contains a specific element
        System.out.println("27. Checking if the vector contains 'Temple': " + names.contains("Temple"));

        // Removing all elements from the vector
        names.removeAllElements();  
        System.out.println("28. Printing elements after removing all elements: " + names);  

        // toArray() method to convert vector to array
        String[] namesArray = new String[names.size()];
        names.copyInto(namesArray);
        System.out.println("29. Printing elements of the converted array: " + Arrays.toString(namesArray));

        // toString() method to get string representation of the vector
        System.out.println("30. String representation of the vector: " + names.toString()); 
    }
}
