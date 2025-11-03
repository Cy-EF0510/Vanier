import java.util.StringJoiner;

public class ChainList<T> {
    private Node<T> head;
    private int size;

    // Private inner class for the nodes
    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    // Constructor
    public ChainList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * TODO: Implement this method.
     * <p>
     * This method should create a new node with the given element
     * and add it to the beginning of the list.
     *
     * @param element The element to add to the front of the list.
     */
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }


    // ----- You do not need to modify the code below this line -----

    /**
     * A static method to build a pre-populated list for testing purposes.
     * This method constructs the list manually without using any add methods.
     *
     * @return A ChainList containing [10 -> 20 -> 30]
     */
    public static ChainList<Integer> buildTestCase() {
        ChainList<Integer> list = new ChainList<>();
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);

        // Manually link nodes
        n1.next = n2;
        n2.next = n3;

        // Manually set head and size
        list.head = n1;
        list.size = 3;

        return list;
    }


    /**
     * Overrides toString to provide a visual representation of the list.
     */
    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringJoiner joiner = new StringJoiner(" -> ", "[", "]");
        Node<T> current = head;
        while (current != null) {
            joiner.add(current.element.toString());
            current = current.next;
        }
        return joiner.toString();
    }
}
