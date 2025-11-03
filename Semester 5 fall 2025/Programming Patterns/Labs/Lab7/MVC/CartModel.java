import java.util.HashMap;
import java.util.Map;

public class CartModel {
    private Map<Product, Integer> items;
    
    public CartModel(){
        items = new HashMap<>();
    }

    public void addProduct(Product p){
        if(!items.containsKey(p)){
            items.put(p, 1);
        }
        else{
            items.put(p, items.get(p) + 1);
        }
    }

    public Map<Product, Integer> getItems(){
        return items;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Map.Entry<Product, Integer> entry: items.entrySet()){
            double entryPrice;
            entryPrice = entry.getKey().getPrice() * entry.getValue();
            totalPrice += entryPrice;
        }
        return totalPrice;
    }
}
