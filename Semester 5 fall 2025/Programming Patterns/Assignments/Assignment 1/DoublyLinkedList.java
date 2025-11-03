import java.util.Iterator;
import java.util.ListIterator;

import org.w3c.dom.Node;

public class DoublyLinkedList<E> implements MyList<E> {
    protected Node<E> head, tail;
    protected int size = 0;

    @Override
    public int size() {
        return size;
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
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public void add(int index, E e) {
        Node<E> current = head;
        if(index == 0){
            addFirst(e);
        }
        else if(current == tail){
            addLast(e);
        }
        else{
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            Node<E> newNode = new Node<>(e);
            if(current == null){
                return;
            }
            else{
                newNode.next = current.next;
                newNode.prev = current;
                if(current.next != null){
                    current.next.prev = newNode;
                }
                current.next = newNode;
                size++;
            }
        }
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = null;
        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
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
            current = current.next;
        }
        return null;
    }

    @Override
    public int indexOf(Object e) {
        Node<E> current = head;
        int index = 0;
        while(current != null){
            if(current.element.equals(e)){
                return index;
            }
            index++;
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
    public E remove(int index) {
        if(index < 0 || index >= size){
            return null;
        }
        else if(index == 0){
            return removeFirst();
        }
        else if(index == size - 1){
            return removeLast();
        }
        else{
            Node<E> previous = head;//node before the one to be removed
            for(int i = 1; i < index; i++){//traverse to the node before the one to be removed
                previous = previous.next;
            }
            if (previous == null || previous.next == null) {
                return null;
            }
            Node<E> current = previous.next;
            Node<E> nextNode = current.next;

            previous.next = nextNode;
            if(nextNode != null){
                nextNode.prev = previous;
            }
            current.next = current.prev = null; //help garbage collection

            size--;
            return current.element;
            
        }
    }

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
            size--;
            return temp;
        }
    }

    public E removeLast(){
        if(size == 0){
            return null;
        }
        else if(size == 1){
            head = null;
            tail = null;
            return null;
        }
        else{
            Node<E> temp = tail;
            tail = tail.prev;
            if(tail != null)
                tail.next = null;
                size--;
            return temp.element;
        }
    }

    @Override
    public E set(int index, E e) {
        if(index < 0 || index >= size){
            return null;
        }
        else{
            Node<E> current = head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            E temp = current.element;
            current.element = e;
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

    @Override
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements java.util.ListIterator<E> {
        private Node<E> current;
        private int nextIndex;

        public LinkedListIterator() {
            current = head;
            nextIndex = 0;
        }

        public LinkedListIterator(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                + size);
            current = head;
            nextIndex = 0;
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

    public ListIterator<E> listIterator() {
        return new LinkedListIterator(); 
    }
    
    public ListIterator<E> listIterator(int index) {
        return new LinkedListIterator(index); 
    }
        
}
