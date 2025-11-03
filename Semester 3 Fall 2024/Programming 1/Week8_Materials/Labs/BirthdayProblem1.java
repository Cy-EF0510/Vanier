package Labs;

public class BirthdayProblem1 {
    public static void main(String[] args) {
        int[] used;
        int count; 
        used = new int[365]; // Initially, all entries are false.
        count = 0;
        while (true) {
            // Select a birthday at random, from 0 to 364.
            // If the birthday has already been used, quit.
            // Otherwise, record the birthday as used.
            int birthday; // The selected birthday.
            birthday = (int) (Math.random() * 365);
            count++;
            System.out.printf("Person %d has birthday number %d%n", count, birthday);
            used[birthday]++;
            if (used[birthday] == 3) { //If the number has appeared three times in the list
                break;
            }
        } // end while
        System.out.println();
        System.out.println("A duplicate birthday was found after "
                + count + " tries.");
    }
} // end class BirthdayProblem
