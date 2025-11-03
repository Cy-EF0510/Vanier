import java.util.Map;

public class CartController {
    private CartModel model;
    private CartView view;

    public CartController(CartModel model, CartView view){
        this.model = model;
        this.view = view;
    }

    public void handleAddProduct(Product p){
        model.addProduct(p);
    }

    public void handleDisplayCart(){
        Map<Product, Integer> items = model.getItems();
        double total = model.getTotalPrice();
        view.displayCart(items, total);
        for(Map.Entry<Product, Integer> entry : items.entrySet()){
            System.out.println(entry.getKey().getName() + " (" + entry.getValue() + ")");
        }
    }
}
