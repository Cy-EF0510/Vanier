import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        repo.add(new Product(001, "Phone", 1000));
        repo.add(new Product(002, "Earphones", 100));
        repo.add(new Product(003, "Laptop", 1500));
        repo.add(new Product(004, "Water Bottle", 20));
        repo.add(new Product(005, "cat", 500));
        System.out.println(repo.get(2));

        repo.getAll().forEach(System.out::println);

        System.out.println("\nE2P09");
        // System.out.println("Highest Price: " + Utils.findMax(repo.productList));

        // System.out.println();
        // System.out.println("E2P10");
        // for(Product e : Utils.filterGreaterThan(repo.productList, repo.get(2))){
        //     System.out.println(e.toString());
        // }

        System.out.println("\nExercise 3: Processing Products with Stream");
        List<Product> newList = repo.getAll();
        for(Product e : newList){
            System.out.println(e.toString());
        }

        //Filter
        System.out.println("\nFilter less than 50");
        List<Product> listLessThan50 = newList.stream()
                .filter(p -> p.getPrice() < 50)
                .collect(Collectors.toList());
        listLessThan50.forEach(System.out::println);
        //Map
        System.out.println("\nList out all the names");
        List<String> nameList = newList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        //Filter and Map
        System.out.println("\nNames starting with L");
        List<String> lList = newList.stream()
                .filter(p -> p.getName().charAt(0) == 'l' || p.getName().charAt(0) == 'L')
                .map(Product::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        lList.forEach(System.out::println);

        //Reduce/Aggregate
        System.out.println("\nTotal Cost");
        Double sum = newList.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println(sum);
    }
}
