import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(
            
        );
        students.add(
            new Student(6243515, "Cyril"),
            new Student(6259012, "Bob"),
            new Student(6772769, "Alex")
        );

        Function<Student, Integer> getStudentId = Student::getStudentId;

    }
}
