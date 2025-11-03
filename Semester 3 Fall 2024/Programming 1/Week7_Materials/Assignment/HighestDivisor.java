package Assignment;

public class HighestDivisor {
    public static void main(String[] args) {
        int highestDivisor = 0;
        int highestNum = 0;
        for(int i = 1; i <= 10000; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count > highestDivisor){
                highestDivisor = count;
                highestNum = i;
            }
        }
        System.out.println(highestNum + " is the number with the most divisors, which is " + highestDivisor);
    }
}
