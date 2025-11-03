//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChainList<Integer> list = ChainList.buildTestCase();
        System.out.println("Original list: " + list);

        System.out.println("Adding 5 to the front...");
        list.addFirst(5);

        System.out.println("List after addFirst(5): " + list);
        System.out.println("\nExpected final list: [5 -> 10 -> 20 -> 30]");
    }
}