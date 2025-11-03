public class ProductApiAdapter implements IProductService{
    private NewProductApi npaObject; 

    public ProductApiAdapter(NewProductApi npaObject){
        this.npaObject = npaObject;
    }

    @Override
    public Product getProductById(int id) {
        String productString = npaObject.fetchProductJSon(id);
        //{ "productId": 101, "productName": "SuperWidget", "cost": 45.99 }
        String productId = productString.split("\"productId\":")[1].split(",")[0].trim();
        String productName = productString.split("\"productName\": \"")[1].split("\"")[0];
        String cost = productString.split("\"cost\":")[1].split("}")[0].trim();
        
        Product newProduct = new Product(Integer.parseInt(productId), productName, Double.parseDouble(cost));
        return newProduct;
    }
    
    public static void main(String[] args) {
        NewProductApi instance = new NewProductApi();
        ProductApiAdapter adapter = new ProductApiAdapter(instance);

        Product product = adapter.getProductById(10);
        System.out.println(product);
    }
}
