package Week10_Materials;
public class Dice {
    private int die1;
    private int die2;

    public Dice(){ //Default constructor

    }

    public void roll(){
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    public int totalRoll(){
        return die1 + die2;
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }
    public String toString(){
        return "The first die comes up " + die1 + " and second die comes up " + die2 + ".";
    }
}