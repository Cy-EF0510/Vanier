package Week9_Materials;

public class PlayerData {
    static int playerCount = 0;
    private String name;
    private int age;

    public PlayerData(String tempName, int tempAge){
        this.name = tempName;
        this.age = tempAge;
        playerCount++;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}
