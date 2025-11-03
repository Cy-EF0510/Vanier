import java.util.Map;

public class CartView {
    public void displayCart(Map<Product, Integer> items, double total){
        double totalPrice = 0;
        for(Map.Entry<Product, Integer> entry: items.entrySet()){
            int quantity = entry.getValue();
            double price = entry.getKey().getPrice() * quantity;
            System.out.println("Name: " + entry.getKey().getName() + " Quantity: " + quantity + " Price: " + price);
            totalPrice += price;
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
