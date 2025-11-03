package Labs;

public class Dog {
    String name, color;
    int age;

    public Dog(String tempName, String tempColor, int tempAge) {
        name = tempName;
        color = tempColor;
        age = tempAge;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Snoopy", "White", 47);
        String dogSound = myDog.makesSound("Woof");
        System.out.println(dogSound);
        myDog.favoriteFood("Pizza");
    }

    public String makesSound(String sound) {
        return "The sound a dog makes is " + sound;
    }

    public void favoriteFood(String food) {
        System.out.println("A dog\'s favorite food is " + food);
    }
}