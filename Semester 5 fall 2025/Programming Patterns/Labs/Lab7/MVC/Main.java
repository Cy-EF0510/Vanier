public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200.00);
        Product mouse = new Product("Mouse", 45.00);

        CartModel model = new CartModel();
        CartView view = new CartView();
        CartController controller = new CartController(model, view);

        System.out.println("Adding Laptop...");
        controller.handleAddProduct(laptop);
        controller.handleDisplayCart();
        System.out.println("\nAdding Mouse...");
        controller.handleAddProduct(mouse);
        System.out.println("Adding another Laptop...");
        controller.handleAddProduct(laptop);
        controller.handleDisplayCart();
    }
}
