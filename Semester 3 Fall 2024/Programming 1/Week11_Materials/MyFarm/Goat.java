package MyFarm;

public class Goat extends Herbivore {
    public Goat(String name, int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println("Meh");
    }
    
}
