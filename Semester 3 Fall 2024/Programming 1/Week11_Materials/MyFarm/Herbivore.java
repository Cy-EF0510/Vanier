package MyFarm;

public class Herbivore extends Animal{
    public Herbivore(String name, int age){
        super(name, age);
    }
    public void typeOfFood(){
        System.out.println("I am " + name + "and I'm a herbivore and I eat grass");
    }
}
