public class Main {
    public static void main(String[] args) {
        LinkedStack<String> myLinkedList = new LinkedStack<>();
        LinkedStack<Integer> emptyStack = new LinkedStack<>();
        myLinkedList.push("Hello World");
        myLinkedList.push("Bomboclat");
        myLinkedList.push("LMAO");
        myLinkedList.push("Hello World");
        myLinkedList.push("Java");

        System.out.println("Pop head: " + myLinkedList.pop());
        System.out.println("pop head: " + myLinkedList.pop());

        System.out.println("peek head: " + myLinkedList.peek());

        System.out.println("get size: " + myLinkedList.getSize());
        System.out.println("is empty: " + myLinkedList.isEmpty());

        System.out.println("Current List: " + myLinkedList.toString());

        

        System.out.println("Empty list: " + emptyStack.toString());
        System.out.println("is empty: " + emptyStack.isEmpty());
    }
}
