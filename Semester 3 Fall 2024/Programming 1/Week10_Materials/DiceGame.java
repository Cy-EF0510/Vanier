package Week10_Materials;

public class DiceGame {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        int rollCount = 0;
        while(myDice.getDie1() != 1 && myDice.getDie2() != 1){
            myDice.roll();
            rollCount++;
            System.out.println(myDice);
        }
        System.out.println(rollCount);
    }
}
