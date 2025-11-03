import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Product{
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    public static void main(String[] args) {
        HashMap<Integer, Product> hmList = new HashMap<>();
        LinkedHashMap<Integer, Product> lhmList = new LinkedHashMap<>();
        TreeMap<Integer, Product> tmList = new TreeMap<>();

        //HashMap
        hmList.put(67, new Product("Book", 21));
        hmList.put(69, new Product("Laptop", 1360));
        hmList.put(21, new Product("Pencil", 4.20));
        hmList.put(727, new Product("Phone", 700));

        //LinkedHashMap
        lhmList.put(67, new Product("Book", 21));
        lhmList.put(69, new Product("Laptop", 1360));
        lhmList.put(21, new Product("Pencil", 4.20));
        lhmList.put(727, new Product("Phone", 700));

        //TreeMap
        tmList.put(67, new Product("Book", 21));
        tmList.put(69, new Product("Laptop", 1360));
        tmList.put(21, new Product("Pencil", 4.20));
        tmList.put(727, new Product("Phone", 700));

        System.out.println(hmList.get(67));

        //prints the products randomly
        System.out.println("\nHashMap");
        for(Map.Entry<Integer, Product> entry : hmList.entrySet()){
            System.out.println("ID: " + entry.getKey() + " " + entry.toString());
        }

        //prints the product based on insertion order
        System.out.println("\nLinkedHashMap");
        for(Map.Entry<Integer, Product> entry : lhmList.entrySet()){
            System.out.println("ID: " + entry.getKey() + " " + entry.toString());
        }

        //prints the product based on the key
        System.out.println("\nTreeMap");
        for(Map.Entry<Integer, Product> entry : tmList.entrySet()){
            System.out.println("ID: " + entry.getKey() + " " + entry.toString());
        }
        // System.out.println(tmList);
        
    }
}
