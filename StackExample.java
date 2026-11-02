
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("1. Stack elements: " + stack);
        // Popping an element
        int poppedElement = stack.pop();
        System.out.println("2. Popped element: " + poppedElement);
        // Printing updated stack
        System.out.println("3. Updated stack: " + stack);  
        // Peeking the top element
        int topElement = stack.peek();
        System.out.println("4. Top element: " + topElement);  
        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty(); 
        System.out.println("5. Is stack empty? " + isEmpty);
        // Searching for an element
        int position = stack.search(20);    
        System.out.println("6. Position of 20: " + position);
        // Getting the size of the stack
        int size = stack.size();
        System.out.println("7. Size of stack: " + size);
        // Clearing the stack
        stack.clear();
        System.out.println("8. Stack after clearing: " + stack);
        // Pushing elements again
        stack.push(40);
        System.out.println("9. Stack after pushing 40: " + stack);
        // Popping the last element
        poppedElement = stack.pop();
        System.out.println("10. Popped element: " + poppedElement);
        
    }
}
