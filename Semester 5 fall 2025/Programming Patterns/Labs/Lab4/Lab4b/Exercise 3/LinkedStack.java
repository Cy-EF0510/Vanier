public class LinkedStack<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    protected Node<E> head, tail;

    public void push(E o) {
        Node<E> newNode = new Node<>(o);
        newNode.next = head;
        head = newNode;
    }

    public E pop() {
        if(head != null){
            Node<E> removedNode = head;
            E rNodeElement = removedNode.element;
            head = head.next;
            
            return rNodeElement;
        }
        return null;
    }

    public E peek() {
        return head.element;
    }

    public int getSize() {
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        
        return size + 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    protected static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element){
            this.element = element;
        }
    }

}