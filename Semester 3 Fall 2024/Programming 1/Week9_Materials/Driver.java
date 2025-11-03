package Week9_Materials;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        PlayerData[] playerNum;
        playerNum = new PlayerData[3];
        String playerName;
        int playerAge;

        for(int i = 0; i < playerNum.length; i++){
            System.out.println("Enter your player name: ");
            playerName = input.nextLine();
            System.out.println("Enter player age");
            playerAge = input.nextInt();
            input.nextLine();
            playerNum[i] = new PlayerData(playerName, playerAge);
            System.out.println("Number of players: " + PlayerData.playerCount);
        }
        for(PlayerData player:playerNum){
            System.out.println(player.getName() + " is " + player.getAge() + " years old");
        }*/
        
        Scanner input = new Scanner(System.in);
        /*//create playerData object
        PlayerData player1 = new PlayerData("Carl", 10);
        //save the player in the array
        System.out.println("Player Name: " + player1.getName());
        System.out.println("Number of players " + PlayerData.playerCount);*/
        System.out.println("Enter student name: ");
        String name = input.nextLine();

        int[] test = new int[3];
        Student student1 = new Student(name);
        for(int i = 0; i < test.length; i++){
            System.out.println("Enter your test score: ");
            test[i] = input.nextInt();
        }
        System.out.println("Student name: " + student1.getName());
        student1.setTest1(test[0]);
        student1.setTest2(test[1]);
        student1.setTest3(test[2]);
        //calculate the average

        System.out.println(student1.testAvg());
    }
}
