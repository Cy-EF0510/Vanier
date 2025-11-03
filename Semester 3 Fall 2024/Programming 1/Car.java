import java.util.Scanner;

public class Car{
    String brand;
    int year;
    public Car(String tempBrand, int tempYear){
        tempBrand = brand;
        tempYear = year;
    }
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter the desired brand name and year: ");
        System.out.print("Brand name: ");
        String brand = input.nextLine();
        System.out.print("Year: ");
        int year = input.nextInt();*/
        int yearBlyat = 2005;
        String brandBlyat= "Nissan";
        Car newCar = new Car(brandBlyat, yearBlyat);
        System.out.println(newCar.brandBlyat);
        //newCar.showPrice(year);
    }
    /*public void showPrice(int year){
        if(year <= 2015){
            System.out.println("The price is 10,000 cad");
        }
        else if(year >= 2016 && year <= 2023){
            System.out.println("The price is 20,000 cad");
        }
        else{
            System.out.println("The car is not for sale");
        }
    }*/
}