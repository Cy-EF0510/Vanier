public class Bicycle {
    // Attributes of a bicycle (Class variables)
    int length;
    String color;
    double price;
    int speed;

    public Bicycle(int tempLength, String tempColor, double tempPrice, int tempSpeed) {// Constructor
        length = tempLength;
        color = tempColor;
        price = tempPrice;
        speed = tempSpeed;
    }

    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle(1, "Red", 100.00, 0);// Creating a Bicycle project
        // Print myBicycle attributes

        System.out.println("The length of my new bicycle is " + myBicycle.length);
        System.out.println("The color of my new bicycle is " + myBicycle.color);
        System.out.println("The price of my new bicycle is " + myBicycle.price);
        System.out.println("The price of my new bicycle is " + myBicycle.speed);
        // turn myBicycle
        myBicycle.Turn("diagonal");
        myBicycle.Turn("left");
        myBicycle.Turn("right");
        myBicycle.Turn("upside down");
        myBicycle.Turn("upwards");
        myBicycle.Turn("downwards");
        myBicycle.Turn("spirally");
        myBicycle.Turn("straight");
        myBicycle.Turn("backwards");
    }

    public void Turn(String direction) {
        System.out.println("Bicycle is turning " + direction);
    }
}
