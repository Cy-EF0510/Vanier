package Score;
import java.util.Scanner;
public class Student extends Miscellaneous{
    Scanner input = new Scanner(System.in);

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(){
        studentId = 0;
        studentName = null;
    }

    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setStudentID(int i){
        studentId = i;
    }
    public void setStudentName(String s){
        studentName = s;
    }

    public String schoolName(){
        return "Yokoso Watashi no Vanier Society";
    }

    public String schoolName(String schoolName){
        return "Yokoso Watashi no " + schoolName + " Society";
    }

    public String work(){
        return "You need a JOB";
    }

    public String hobby(){
        return "imagine having no hobbies";
    }

    public String toString(){
        return "Student ID: " + studentId + " Student Name: " + studentName;
    }
}
