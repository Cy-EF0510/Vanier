import java.util.Random;
public class PerformanceTest {
    public static void timeOperation (String description, Runnable operation){
        long startTime = System.nanoTime();
        operation.run();
        long endTime = System.nanoTime () ;
        long duration = ( endTime - startTime ) / 1000000; //milliseconds
        System.out.printf ("%-50s: %d ms%n", description, duration);
    }

    public static void main ( String [] args ) {
        int N = 50000; // Number of elements for bulk operations
        int M = 10000; // Number of elements for random insertions
        System.out.println(" --- Testing with N = " + N + " elements ---");
        // --- Add at Random Index ---
        Random rand = new Random () ;
        MyLinkedList<Integer> singleListForRandom = new MyLinkedList< >() ;
        DoublyLinkedList < Integer > doubleListForRandom = new DoublyLinkedList < >() ;
        // --- Adding at the Beginning and Removing at the End ---
        MyLinkedList<Integer> singleListForExtra = new MyLinkedList<>();
        DoublyLinkedList<Integer> doubleListForExtra = new DoublyLinkedList<>();

        timeOperation ("Singly: Add at Random Index (" + M + "times)", () -> {
        for (int i = 0; i < M ; i ++) {
            // Add to a list that is growing
            int size = singleListForRandom.size() ;
            int index = size == 0 ? 0 : rand.nextInt(size) ;
            singleListForRandom.add( index , i ) ;
        }
        });
        timeOperation("Doubly: Add at Random Index (" + M + "times)", () -> {
            for (int i = 0; i < M ; i ++) {
                int size = doubleListForRandom.size () ;
                int index = size == 0 ? 0 : rand.nextInt (size) ;
                doubleListForRandom.add( index , i ) ;
            }
        });
        // TODO : Implement the other tests as described below .
        timeOperation("Singly: Adding at the Beginning (" + N + " times)", () -> {
            // add to the front of the list for N times
            for(int i = 0; i < N; i++){
                singleListForExtra.addFirst(i);
            }
        });

        timeOperation("Doubly: Adding at the Beginning (" + N + " times)", () -> {
            // add to the front of the list for N times
            for(int i = 0; i < N; i++){
                doubleListForExtra.addFirst(i);
            }
        });

        timeOperation("Singly: Removing from the End (" + N + " times)", () -> {
            for(int i = N; i >= 0; i--){
                singleListForExtra.removeLast();
            }
        });

        timeOperation("Doubly: Removing from the End (" + N + " times)", () -> {
            for(int i = N; i >= 0; i--){
                doubleListForExtra.removeLast();
            }
        });
    }
}