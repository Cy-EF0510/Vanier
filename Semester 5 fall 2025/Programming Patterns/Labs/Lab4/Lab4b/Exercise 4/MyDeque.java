public class MyDeque<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    protected Node<E> head, tail;

    /*
     * check if the list is empty
     * if empty
     *      the new node become both the head and tail
     * else
     *      like the stack list, create a new node, turn it into the head
     */
    void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.next = head; //the new node will become the head
            head.prev = newNode; //the former head is pointing to the new head
            head = newNode; //you assign the newNode to the head
        }
    }
    

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if(tail == null){
            head = tail = newNode;
        }
        else{
            newNode.prev = tail; //new node will become the tail
            tail.prev = newNode; //former tail is pointing the the new
            tail = newNode;
        }
    }

    public E removeFirst() {
        head = head.next;
        return head.element;
    }

    public E removeLast() {
        tail = tail.prev;
        return tail.element;
    }

    public E peekFirst() {
        return head.element;
    }

    public E peekLast() {
        return tail.element;
    }

    public int getSize() {
        Node<E> current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        if(head == null && tail == null){
            return true;
        }
        return false;
    }



    protected static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
        }
    }
}