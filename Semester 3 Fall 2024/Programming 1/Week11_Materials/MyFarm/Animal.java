package MyFarm;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name  = name;
        this.age = age;
    }

    public void typeOfFood(){
        System.out.println("I am  " + name + " and I eat anything");
    }

    public void printAge(){
        System.out.println("I have lived for this number of year: " + age);
    }
}
