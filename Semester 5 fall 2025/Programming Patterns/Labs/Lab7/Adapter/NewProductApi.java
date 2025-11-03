public class NewProductApi {
    public String fetchProductJSon(int id){
        return "{ \"productId\": " + id + ", \"productName\": \"SuperWidget\", \"cost\": 45.99 }";
    }
}
