package Week9_Materials.Lab;

public class Student {
    private String name;
    private int test1, test2, test3;    

    public Student(String name){
        this.name = name;
    }
    
    public double testAvg(){
        return (test1 + test2 + test3) / 3;
    }
    //getter
    public String getName(){
        return name;
    }

    public int getTest1(){
        return test1;
    }

    public int getTest2(){
        return test2;
    }

    public int getTest3(){
        return test3;
    }

    //setter
    public void setTest1(int score){
        test1 = score;
    }

    public void setTest2(int score){
        test2 = score;
    }

    public void setTest3(int score){
        test3 = score;
    }

}

