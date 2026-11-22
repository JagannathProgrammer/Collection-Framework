import java.util.*;
public class QueueInterfaceExample {

    public static void main(String[] args) {

        Queue<String> Names = new LinkedList<>();

        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");

        System.out.println(Names);

        Names.remove();

        System.out.println(Names);
    }
}
