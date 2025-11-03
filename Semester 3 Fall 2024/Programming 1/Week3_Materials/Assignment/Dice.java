package Assignment;

public class Dice {
    public static void main(String[] args) {
        int numRolled1, numRolled2, numTotal;

        numRolled1 = (int) (Math.random() * 6) + 1;
        numRolled2 = (int) (Math.random() * 6) + 1;
        numTotal = numRolled1 + numRolled2;

        System.out.println("The first die comes up " + numRolled1);
        System.out.println("The second die comes up " + numRolled2);
        System.out.println("Your total roll is " + numTotal);
    }
}
