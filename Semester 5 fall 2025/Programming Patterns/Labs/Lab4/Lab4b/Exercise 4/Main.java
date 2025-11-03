public class Main {
    public static void main(String[] args) {
        MyDeque<Integer> list = new MyDeque<>();

        list.addFirst(123); //2
        list.addFirst(234); //1
        list.addLast(890); //3
        list.addLast(789); //4

        System.out.println("First element: " + list.peekFirst());
        System.out.println("Last element: " + list.peekLast());
        System.out.println("Remove 234 (shows 123): " + list.removeFirst());
        System.out.println("Remove 789 (shows 890): " + list.removeLast());

        System.out.println("Size: " + list.getSize());
        System.out.println("is it empty " + list.isEmpty());
    }
}
