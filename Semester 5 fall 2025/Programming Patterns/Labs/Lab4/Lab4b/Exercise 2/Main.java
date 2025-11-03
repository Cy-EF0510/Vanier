import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Hello World");
        myLinkedList.add("Bomboclat");
        myLinkedList.add("LMAO");
        myLinkedList.add("Hello World");
        myLinkedList.add("Java");
        System.out.println("Current List: " + myLinkedList.toString());

        System.out.println("Contains Hello World: " + myLinkedList.contains("Hello World"));
        System.out.println("Contains Bye Bye: " + myLinkedList.contains("Bye Bye"));

        System.out.println("Return index 0 (Hello World): " + myLinkedList.get(0).toString());

        System.out.println("Return index of LMAO: " + myLinkedList.indexOf("LMAO"));
        System.out.println("Last index of Hello World: " + myLinkedList.lastIndexOf("Hello World"));

        System.out.println("Replace Bomboclat with Programming: " + myLinkedList.set(1, "Programming"));
        System.out.println("Current List: " + myLinkedList.toString());

        Iterator<String> list = myLinkedList.iterator();
        System.out.println();
        System.out.println("Iterator");
        System.out.println(list.next());
        System.out.println(list.next());
        System.out.println(list.hasNext());
    }
}
