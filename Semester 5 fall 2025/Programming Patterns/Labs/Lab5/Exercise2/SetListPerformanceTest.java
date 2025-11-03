package Exercise2;
import java.util.*;

public class SetListPerformanceTest {
    static final int N = 50000;

    public static void main(String[] args) {
        // Create a list of N integers
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        Collections.shuffle(list); // Shuffle for realistic testing
        // Test HashSet performance
        Collection<Integer> hashSet = new HashSet<>(list);
        System.out.println(" Member test time for HashSet is " +
                getTestTime(hashSet) + " ms");
        System.out.println(" Remove element time for HashSet is " +
                getRemoveTime(hashSet) + " ms");
        // Test ArrayList performance
        Collection<Integer> arrayList = new ArrayList<>(list);
        System.out.println(" Member test time for ArrayList is " +
                getTestTime(arrayList) + " ms");
        System.out.println(" Remove element time for ArrayList is " +
                getRemoveTime(arrayList) + " ms");
    }

    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        // Test if a number is in the collection N times
        for (int i = 0; i < N; i++) {
            c.contains((int) (Math.random()
                    * 2 * N));
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            c.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}
