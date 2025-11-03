public class StudentBudget {
    public static void main(String[] args) {
        double totalBudget, food, transportation, entertainment;

        totalBudget = 1000.0;
        food = 200.0;
        transportation = 150.0;
        entertainment = 300.0;

        /* 
        totalBudget = 750.0;
        food = 180.0;
        transportation = 90.0;
        entertainment = 120.0;
        */
        
        System.out.println(totalBudget - food - transportation - entertainment);        
    }
}
