import java.util.List;
import java.util.ArrayList;
public class ProductRepository implements GenericRepository<Product>{
    ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void add(Product item) {
        productList.add(item);
    }

    @Override
    public Product get(int index) {
        return productList.get(index);
    }

    @Override
    public List<Product> getAll() {
        return(productList);
    }
}