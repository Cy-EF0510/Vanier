import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Transaction{
    private String category;
    private double amount;
    public Transaction(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
    public String getCategory() {
        return category;
    }
    public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        ArrayList<Transaction> list = new ArrayList<>();
        list.add(new Transaction("Groceries", 55.75));
        list.add(new Transaction("Transport", 22.50));
        list.add(new Transaction("Utilities", 120.00));
        list.add(new Transaction("Groceries", 34.25)); 

        TreeMap<String, Double> tmList = new TreeMap<>();

        for(Transaction t : list){
            System.out.println("Category: " + t.getCategory() + " Amount: " + t.getAmount());

            if(!tmList.containsKey(t.getCategory())){//If the category is NOT in the map: This is the first expense for this category. put the category and its amount into the map.
                tmList.put(t.getCategory(), t.getAmount());
            }
            else if(tmList.containsKey(t.getCategory())){
                tmList.put(t.getCategory(), tmList.get(t.getCategory()) + t.getAmount());
            }
            
        }
        System.out.println("\nFinal Summary");
        for (Map.Entry<String, Double> t : tmList.entrySet()) {
            System.out.println("Category: " + t.getKey() + " Amount: " + t.getValue());
        }
    }
}