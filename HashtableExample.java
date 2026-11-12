import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Example");
        table.put(101, "JK");
        table.put(110, "RAM");
        table.put(105, "RK");

        System.out.println(table);
        System.out.println(table.get(1));
        System.out.println(table.size());
        System.out.println(table.clone());
        System.out.println(table.replace(110, "Update"));
        System.out.println(table);
        System.out.println(table.replace(105, "RK", "Jay"));
        System.out.println(table);
        
    }
}
