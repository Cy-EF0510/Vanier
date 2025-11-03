import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        //Lambda Expressions with no parameters
        Runnable task = () -> System.out.println("Hello Lambda");
        task.run();
        System.out.println();


        //Lambda Expressions with parameters and Type Interface
        MathOperation add = (a, b) -> a + b; //You define the 'add' function of the interface 'MathOperation'
        System.out.println("5 + 3 + " + add.operate(5, 3)); //you call the 'operate' method of the 'add' function
        System.out.println();


        //Lambda Parameter with a Body
        Comparator<String> byLength = (s1, s2) -> s1.length() - s2.length(); //Comparing two strings based on their lengths
        String[] words = {"apple", "kiwi", "banana"}; //array
        Arrays.sort(words, byLength); //Calling the sort method with the comparator byLength
        System.out.println(Arrays.toString(words));
        System.out.println();
        

        //Method references
        List<String> list = Arrays.asList("A", "B", "C");

        //The method reference System.out::println is equivalent to:
        //s -> System.out.println(s);
        list.forEach(System.out::print); //The forEach method replaces the for each loop
        System.out.println("\n");


        //java.util.function Package
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
            .filter(isEven)
            .forEach(System.out::print);
        System.out.println();
    }
}