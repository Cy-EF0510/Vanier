package Labs;

public class Cat {
    String name, color;
    int age;

    public Cat(String tempName, String tempColor, int tempAge) {
        name = tempName;
        color = tempColor;
        age = tempAge;

    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Tom", "gray", 0);
        String catSound;
        catSound = myCat.makesSound();
        System.out.println(catSound);
        myCat.favouriteFood();
    }

    public String makesSound() {
        return "Meow";
    }

    public void favouriteFood() {
        System.out.println("A cat's favourite food is fish!");
    }
}
