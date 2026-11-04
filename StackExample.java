
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // System.out.println("Stack capacity: " + stack.capacity());

        // System.out.println("1. Stack elements: " + stack);
        // // Popping an element
        // int poppedElement = stack.pop();
        // System.out.println("2. Popped element: " + poppedElement);
        // // Printing updated stack
        // System.out.println("3. Updated stack: " + stack);  
        // // Peeking the top element
        // int topElement = stack.peek();
        // System.out.println("4. Top element: " + topElement);  
        // // Checking if the stack is empty
        // boolean isEmpty = stack.isEmpty(); 
        // System.out.println("5. Is stack empty? " + isEmpty);
        // // Searching for an element
        // int position = stack.search(20);    
        // System.out.println("6. Position of 20: " + position);
        // // Getting the size of the stack
        // int size = stack.size();
        // System.out.println("7. Size of stack: " + size);
        // // Clearing the stack
        // stack.clear();
        // System.out.println("8. Stack after clearing: " + stack);
        // // Pushing elements again
        // stack.push(40);
        // System.out.println("9. Stack after pushing 40: " + stack);
        // // Popping the last element
        // poppedElement = stack.pop();
        // System.out.println("10. Popped element: " + poppedElement);

        
         stack.reversed();
        System.out.println("11. Stack after reversing: " + stack);

        stack.removeElement(20);
        System.out.println("12. Stack after removing element 20: " + stack);

        // stack.removeAllElements();
        // System.out.println("13. Stack after removing all elements: " + stack);

        stack.add(60);
        System.out.println("14. Stack after adding 60: " + stack);

        stack.hashCode();
        System.out.println("15. Hash code of the stack: " + stack.hashCode());

        stack.listIterator();
        System.out.println("16. List iterator of the stack: " + stack.listIterator());

        stack.listIterator(3);
        System.out.println("17. List iterator of the stack from index 3: " + stack.listIterator(3));

        stack.parallelStream();
        System.out.println("18. Parallel stream of the stack: " + stack.parallelStream());

        stack.stream();
        System.out.println("19. Stream of the stack: " + stack.stream());

        stack.spliterator();
        System.out.println("20. Spliterator of the stack: " + stack.spliterator());


    }
}
