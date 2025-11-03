import java.util.Iterator;
import java.util.ListIterator;

import org.w3c.dom.Node;

public class DoublyLinkedList<E> implements MyList<E> {
    protected Node<E> head, tail;
    protected int size = 0;

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(E[] objects) {
    for (E e : objects)
      add(e);
  }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        Node<E> current = head;
        int count = 0;
        while(current != null){
            if(count == index){
                return current.element;
            }
            count++;
            current = head.next;
        }
        return null;
    }

        /** Return the head element in the list */
    public E getFirst() {
        if (size == 0) {
            return null;
        } 
        else {
            return head.element;
        }
    }

      /** Return the last element in the list */
    public E getLast() {
        if (size == 0) {
            return null;
        } 
        else {
            return tail.element;
        }
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> current = head;
        while(current != null){
            if(current.element == o){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(Object e) {
        Node<E> current = head;
        int count = 0;
        while(current != null){
            if(current.element == e){
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> current = tail;
        int count = this.size - 1;
        while(current != null){ //traverse backwards
            if(current.element == e){
                return count;
            }
            count--;
            current = current.prev;
        }
        return -1;//if not found
    }

    @Override
    public E set(int index, E e) {
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            current = current.next;
        }
        E oldElement = current.element;
        current.element = e;
        return oldElement;
    }

      @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
            result.append(", "); // Separate two elements with a comma
            } 
            else {
                result.append("]"); // Insert the closing ] in the string
            }
        }
        return result.toString();
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public void add(int index, E e) {
        Node<E> current = head;
        if(index == 0){
            addFirst(e);
        }
        for(int i = 1; i < index; i++){
            current = current.next;
        }
        if(current != null){
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
        else if(current == tail){
            addLast(e);
        }
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode = head;
        head = newNode;
        size++;

        if(tail == null){
            tail = head;
        }
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);

        if(tail == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E remove(int index) {
        Node<E> prev = head;
        for(int i = 1; i < index; i++){
            prev = prev.next;
        }
        Node<E> current = prev.next;
        if(current != null){
            Node<E> nextNode = current.next;

            prev.next = nextNode;
            if(nextNode != null){
                nextNode.prev = prev;
            }
            size--;
            return current.element;
        }
        else{
            return null;
        }
    }
        

        
        
        
        // if(index < 0 || index >= size){
        //     return null;
        // }
        // else if(index == 0){
        //     return removeFirst();
        // }
        // else if(index == size - 1){
        //     return removeLast();
        // }
        // else{
        //     Node<E> prev = head; //assigning a node to the head
        //     for(int i = 1; i < index; i++){//iterating through the list until you reach the index
        //         prev = prev.next;
        //     }
        //     Node<E> current = prev.next; //
        //     prev.next = current.next;
        //     size--;
        //     return current.element;
        // }
    

    public E removeFirst(){
        if(size == 0){
            return null;
        }
        else{
            E temp = head.element;
            head = head.next;
            size--;
            if(head == null){
                tail = null;
            }
            return temp;
        }
    }

    public E removeLast(){
        if(size == 0){
            return null;
        }
        else if(size == 1){
            E temp = head.element;
            clear();
            return temp;
        }
        else{
            E temp = tail.element;
            tail = tail.prev;
            tail.next = null;
            size--;
            return temp;
        }
    }

    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E e){
            element = e;
        }
    }

    // private class LinkedListIterator implements java.util.Iterator<E>{
    //     private Node<E> current = head; //current index

    //     @Override
    //     public boolean hasNext(){
    //         return (current != null);
    //     }

    //     @Override
    //     public E next() {
    //         E e = current.element;
    //         current = current.next;
    //         return e;
    //     }

    //     @Override
    //     public void remove(){

    //     }
    // }

    
    private class LinkedListIterator implements java.util.ListIterator<E> {
        private Node<E> current = head; // Current index
        private int nextIndex;

        public LinkedListIterator() {
        }
        
        public LinkedListIterator(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                + size);
            for (int nextIndex = 0; nextIndex < index; nextIndex++)
                if(current != null)
                    current = current.next;
        }
    
        public void setLast() {
            current = tail;
        }
    
        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            nextIndex++;
            return e;
        }

        @Override
        public void remove() {
            Node<E> prevNode = current.prev;
            Node<E> nextNode = current.next;
            if(prevNode == null){ //we are at the head
                head = nextNode;
            }
            else{
                prevNode.next = nextNode;
            }

            if(nextNode == null){
                tail = prevNode;
            }
            else{
                nextNode.prev = prevNode;
            }
            size--;
        }

        @Override
        public void add(E e) {
            Node<E> newNode = new Node<>(e);
            if(head == null){
                head = tail = newNode;
            }
            else{
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        @Override
        public boolean hasPrevious() {
            return current != null;
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public E previous() {
            E e = current.element;
            current = current.prev;
            // nextIndex--;
            return e;
        }

        @Override
        public int previousIndex() {
            return nextIndex - 1;
        }

        @Override
        public void set(E e) {
            current.element = e; // TODO Auto-generated method stub
        }
    }

    public ListIterator<Double> LinkedListIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'LinkedListIterator'");
    } 

    public ListIterator<E> listIterator() {
        return new LinkedListIterator(); 
    }
  
  public ListIterator<E> listIterator(int index) {
        return new LinkedListIterator(index); 
    }

//   @Override
//   public Iterator<E> iterator() {
//         // TODO Auto-generated method stub
//         return null;
//     }
}

