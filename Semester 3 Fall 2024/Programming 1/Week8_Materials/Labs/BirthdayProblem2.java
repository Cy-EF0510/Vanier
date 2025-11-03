package Labs;

public class BirthdayProblem2 {
    public static void main(String[] args) {
        int[] used;
        int duplicate;
        used = new int[365];
        duplicate = 0;

        for (int i = 0; i < 365; i++) {
            int birthday;
            birthday = (int) (Math.random() * 365);
            used[birthday]++;
        }
        for (int j = 0; j < used.length; j++) {
            if (used[j] > 0) {
                if (used[j] == 1) {
                    System.out.println("Day" + j + " has " + used[j] + " person");
                } else {
                    System.out.println("Day" + j + " has " + used[j] + " people");
                }
                duplicate++;
            }
        }
        System.out.println();
        System.out.println("There are " + duplicate + " different birthdays");
    }
} // end class BirthdayProblem
