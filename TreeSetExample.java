import java.util.TreeSet;
import java.util.Arrays;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> TS = new TreeSet<>();
        TS.add(10);
        TS.add(5);
        TS.add(15);

        System.out.println("TreeSet: " + TS);
        TS.addAll(Arrays.asList(20, 25, 30));
        System.out.println("1. TreeSet after adding all elements: " + TS);
        TS.clone();
        System.out.println("2. Cloned TreeSet: " + TS);
        System.out.println("3. Does the TreeSet contain 10? " + TS.contains(10));
        TS.isEmpty();  
        System.out.println("4. Is the TreeSet empty? " + TS.isEmpty());
        TS.size();
        System.out.println("5. Size of the TreeSet: " + TS.size()); 
        System.out.println("6. Does the TreeSet contain 15? " + TS.contains(15));
        TS.first();
        System.out.println("7. First element of the TreeSet: " + TS.first());
        TS.last();
        System.out.println("8. Last element of the TreeSet: " + TS.last());
        TS.remove(15);
        System.out.println("9. TreeSet after removing 15: " + TS);
        TS.pollFirst();
        System.out.println("10. TreeSet after removing the first element: " + TS);
        TS.removeLast();
        System.out.println("11. TreeSet after removing the last element: " + TS);

    }
}
