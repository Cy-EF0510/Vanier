package MyFarm;

public class Carnivore extends Animal{
    public Carnivore(String name, int age){
        super(name, age);
    }
    
    public void typeOfFood(){
        System.out.println("I am " + name + "and I'm a carnivore and I eat meat");
    }
}
