public class BirthdayDuplicate {
    public static void main(String[] args) {
        /*Create a boolean array with 365 indices
         * run a loop, inside the loop:
         * - generate a random number from 1-365
         * if the index corresponding to the random num is false, set to true
         * else if it is true, a duplicate is found, print count and exit the program
         */

         boolean[] encountered = new boolean[365];
         for(int i = 0; i < 365; i++){
            int birthday = (int) (Math.random() * 365);
            System.out.println("Birthday " + birthday);
            if(!encountered[birthday]){
                encountered[birthday] = true;
            }
            else{
                System.out.println("It took " + ++i + " tries to find a duplicate");
                break;
            }
         }
    }
}
