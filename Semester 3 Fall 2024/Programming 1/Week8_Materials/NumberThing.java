public class NumberThing {
    public static void main(String[] args) {
        int[] used;
        used = new int[100];
        int count;
        count = 0;
        for(int i = 0; i < used.length; i++){
            int num = (int) (Math.random() * 100);
            count++;
            used[num] ++;
        }

        System.out.println();
        System.out.println("Duplicate");
    }
}
