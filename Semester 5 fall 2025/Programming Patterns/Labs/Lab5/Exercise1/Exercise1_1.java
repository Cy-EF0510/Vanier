package Exercise1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise1_1 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        nameList.add("Alice");
        nameList.add("David");
        nameList.add("Bob");

        nameList.forEach(System.out::println);

        System.out.println("LinkedHashSet");
        LinkedHashSet<String> nameSet = new LinkedHashSet<>(nameList);
        nameSet.forEach(System.out::println);
    }
}