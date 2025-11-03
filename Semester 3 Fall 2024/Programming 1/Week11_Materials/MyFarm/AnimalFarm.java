package MyFarm;

public class AnimalFarm {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Pig", 5);
        myAnimal.typeOfFood();
        myAnimal.printAge();
        Animal myCarnivore = new Carnivore("Wolf", 3);
        myCarnivore.typeOfFood();
        Animal myHerbivore = new Herbivore("Cow", 7);
        myHerbivore.typeOfFood();
        Goat myGoat = new Goat("Goat", 8);
        myGoat.typeOfFood();
        myGoat.printAge();
        myGoat.makeSound();
    }
    
}
