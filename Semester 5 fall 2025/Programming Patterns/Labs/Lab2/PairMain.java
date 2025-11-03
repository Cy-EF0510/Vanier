public class PairMain {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Key1", 727);
        Pair<Integer,String> p2 = new Pair<>(67, "Value1");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
