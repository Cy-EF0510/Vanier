public class DistanceFormula {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distance;
    
        x1 = 3;
        x2 = 6;
        y1 = 4;
        y2 = 8;

        /* 
        x1 = -2;
        x2 = 2;
        y1 = -3;
        y2 = 1;
        */

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(distance);
    }
}
