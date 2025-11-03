package Labs;

public class BirthdayProblem3 {
    public static void main(String[] args) {
        int[] used;
        int count, usedDays;
        used = new int[365];
        count = 0;
        usedDays = 0;

        while (usedDays < 365) {
            int birthday = (int) (Math.random() * 365);
            count++;
            used[birthday]++;
            if (used[birthday] == 1) {
                usedDays++;
            }
        }

        System.out.println();
        System.out.println("It took " + count + " people to have at least one person per for each day of the year");
    }
} // end class BirthdayProblem
