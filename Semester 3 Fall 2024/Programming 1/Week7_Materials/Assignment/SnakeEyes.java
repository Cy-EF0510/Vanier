package Assignment;

public class SnakeEyes {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        int count = 1;
        if(dice1 == dice2){
            System.out.println("You got snake eyes on the " + count + "st time");
        }
        else{
            while(dice1 != dice2){
                dice1 = (int)(Math.random() * 6 + 1);
                dice2 = (int)(Math.random() * 6 + 1);
                System.out.println(dice1 + " " + dice2);
                count++;
            }
        }
        System.out.println("You got snake eyes after " + count + " tries.");
    }
}
