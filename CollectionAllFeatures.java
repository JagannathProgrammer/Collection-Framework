import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class CollectionAllFeatures {
    public static void main(String[] args) {
        // 1. Dynamic Size
        ArrayList<Integer> Num = new ArrayList<>();
        ArrayList<String> Name = new ArrayList<>();
        Num.add(5);
        Num.add(10);
        Num.add(15);
        Num.add(20);

        Name.add("Ram");
        Name.add("Sam");
        Name.add("Karna");
        Name.add("Gobin");

        System.out.println("1. Dynamic Size Integer: "+Num);
        System.out.println("1. Dynamic Size String:"+ Name);

        // 2. Easy Data Store
        Num.add(25);
        Num.add(30);

        Name.add("Krishna");
        Name.add("Gopal");

        System.out.println("2. Easy Data Storage Integer:"+ Num);
        System.out.println("2. Easy Data Storage String :"+ Name);

        // 3. Easy Data Management
        Num.remove(Integer.valueOf(15));
        Num.set(2, 50);

        Name.remove("Sam");
        Name.set(1, "Lakshman");

        System.out.println("3. Easy Data Management Integer: "+Num);
        System.out.println("3. Easy Data Management String:"+Name);

        // 4. Code Reusability
        ArrayList<Integer> NewNum = new ArrayList<>();
        NewNum.addAll(Num);
        ArrayList<String> NewName = new ArrayList<>();
        NewName.addAll(Name);

        System.out.println("4. Code Reusability Integer: "+NewNum);
        System.out.println("4. Code Reusability String: "+NewName);

        // 5. Sorting
        Collections.sort(Num);
        Collections.sort(Name);

        System.out.println("5. Sorting Integer: "+Num);
        System.out.println("5. Sorting Sring: "+Name);

        // 6. Searching
        System.out.println("6. Searching Integer: ");

        System.out.println("Contains 30:"+ Num.contains(30));
        System.out.println("Index of 30: "+Num.indexOf(30));

        System.out.println("6. Searching String: ");

        System.out.println("Contains Krishna: "+Name.contains("Krishna"));
        System.out.println("Index of Krishna: "+ Name.indexOf("Krishna"));

        // 7. Insertion Order
        LinkedHashSet<Integer> Number = new LinkedHashSet<>();
        Number.add(30);
        Number.add(20);
        Number.add(10);
        System.out.println("7. Insertion Order Integer:");
        System.out.println(Number);

        LinkedHashSet<String> Names = new LinkedHashSet<>();
        Names.add("Nakul");
        Names.add("Bheem");
        Names.add("Arjun");
        System.out.println("7. Insertion Order String : ");
        System.out.println(Names);

        // 8. Duplicate Elements
        ArrayList<Integer> Duplicate = new ArrayList<>();
        ArrayList<String> Duplicates = new ArrayList<>();

        Duplicate.add(10);
        Duplicate.add(20);
        Duplicate.add(10);

        Duplicates.add("Java");
        Duplicates.add("Python");
        Duplicates.add("Java");

        HashSet<Integer> Unique = new HashSet<>(Duplicate);
        HashSet<String> Uniques = new HashSet<>(Duplicates);

        System.out.println("8. Duplicate Integer Elements:");
        System.out.println("ArrayList: " + Duplicate);
        System.out.println("HashSet: " + Unique);

        System.out.println("8. Duplicates String Elements:");
        System.out.println("ArrayList: " + Duplicates);
        System.out.println("HashSet: " + Uniques);

        // 9. Different Data Structures

        List<String> ListData = new ArrayList<>();
        Set<String> SetData = new HashSet<>();
        Queue<String> QueueData = new LinkedList<>();
        Map<Integer, String> MapData = new HashMap<>();

        ListData.add("Java");
        SetData.add("Python");
        QueueData.add("C++");
        MapData.put(1, "Java");

        System.out.println("9. Different Data Structures:");
        System.out.println(ListData);
        System.out.println(SetData);
        System.out.println(QueueData);
        System.out.println(MapData);


        // 10. Generics Support
        ArrayList<String> Languages = new ArrayList<>();

        Languages.add("Java");
        Languages.add("Python");

        System.out.println("10. Generics Support:");
        System.out.println(Languages);


        // 11. Easy Traversal
        System.out.println("11. Easy Traversal:");

        Iterator<String> itr = Languages.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // 12. Utility Methods
        System.out.println("\n12. Utility Methods:");

        Collections.reverse(Num);
        System.out.println("Reverse: " + Num);

        System.out.println("Maximum: " +
                Collections.max(Num));

        System.out.println("Minimum: " +
                Collections.min(Num));


        // 13. Bulk Operations
        ArrayList<Integer> A = new ArrayList<>();

        A.add(10);
        A.add(20);
        A.add(30);

        ArrayList<Integer> B = new ArrayList<>();

        B.add(40);
        B.add(50);

        A.addAll(B);

        System.out.println("\n13. Bulk Operations:");
        System.out.println(A);


        // 14. Performance
        System.out.println("\n14. Performance:");

        ArrayList<Integer> Array = new ArrayList<>();
        LinkedList<Integer> Linked = new LinkedList<>();
        HashSet<Integer> Hash = new HashSet<>();

        Array.add(100);
        Linked.add(200);
        Hash.add(300);

        System.out.println("ArrayList: " + Array);
        System.out.println("LinkedList: " + Linked);
        System.out.println("HashSet: " + Hash);


        // 15. Thread Safety Options
        System.out.println("\n15. Thread Safety:");

        Vector<Integer> V = new Vector<>();

        V.add(10);
        V.add(20);
        V.add(30);

        Map<Integer, String> SafeMap =
                new java.util.concurrent.ConcurrentHashMap<>();

        SafeMap.put(1, "Java");
        SafeMap.put(2, "Python");

        System.out.println("Vector: " + V);
        System.out.println("ConcurrentHashMap: " + SafeMap);

    }
}
