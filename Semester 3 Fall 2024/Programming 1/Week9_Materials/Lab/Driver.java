package Week9_Materials.Lab;

public class Driver {
    public static void main(String[] args) {
        Student[] student = new Student[30];
        int passedStudents = 0;
        int failedStudents = 0;

        student[0] = new Student("Jane");
        student[0].setTest1(60);
        student[0].setTest2(40);
        student[0].setTest3(80);

        student[1] = new Student("Jine");
        student[1].setTest1(20);
        student[1].setTest2(40);
        student[1].setTest3(80);

        student[2] = new Student("Jace");
        student[2].setTest1(60);
        student[2].setTest2(60);
        student[2].setTest3(20);

        student[3] = new Student("Jand");
        student[3].setTest1(60);
        student[3].setTest2(60);
        student[3].setTest3(80);

        student[4] = new Student("Mane");
        student[4].setTest1(62);
        student[4].setTest2(34);
        student[4].setTest3(82);

        student[5] = new Student("Dane");
        student[5].setTest1(60);
        student[5].setTest2(40);
        student[5].setTest3(80);
        

        student[6] = new Student("Jill");
        student[6].setTest1(61);
        student[6].setTest2(59);
        student[6].setTest3(80);

        student[7] = new Student("Dill");
        student[7].setTest1(100);
        student[7].setTest2(0);
        student[7].setTest3(100);

        student[8] = new Student("Mill");
        student[8].setTest1(20);
        student[8].setTest2(40);
        student[8].setTest3(80);

        student[9] = new Student("Jack");
        student[9].setTest1(60);
        student[9].setTest2(60);
        student[9].setTest3(20);

        student[10] = new Student("Quack");
        student[10].setTest1(100);
        student[10].setTest2(100);
        student[10].setTest3(100);

        student[11] = new Student("Muck");
        student[11].setTest1(60);
        student[11].setTest2(40);
        student[11].setTest3(80);

        student[12] = new Student("Hane");
        student[12].setTest1(100);
        student[12].setTest2(40);
        student[12].setTest3(100);

        student[13] = new Student("Fane");
        student[13].setTest1(60);
        student[13].setTest2(60);
        student[13].setTest3(20);

        student[14] = new Student("Bane");
        student[14].setTest1(60);
        student[14].setTest2(60);
        student[14].setTest3(80);

        student[15] = new Student("Juic");
        student[15].setTest1(62);
        student[15].setTest2(34);
        student[15].setTest3(82);

        student[16] = new Student("Fame");
        student[16].setTest1(60);
        student[16].setTest2(40);
        student[16].setTest3(80);

        student[17] = new Student("Mady");
        student[17].setTest1(61);
        student[17].setTest2(59);
        student[17].setTest3(80);

        student[18] = new Student("Jand");
        student[18].setTest1(60);
        student[18].setTest2(40);
        student[18].setTest3(80);

        student[19] = new Student("Sandy");
        student[19].setTest1(60);
        student[19].setTest2(40);
        student[19].setTest3(80);

        student[20] = new Student("Pany");
        student[20].setTest1(60);
        student[20].setTest2(60);
        student[20].setTest3(20);

        student[21] = new Student("Peny");
        student[21].setTest1(60);
        student[21].setTest2(60);
        student[21].setTest3(80);

        student[22] = new Student("Mike");
        student[22].setTest1(62);
        student[22].setTest2(34);
        student[22].setTest3(82);

        student[23] = new Student("Molly");
        student[23].setTest1(60);
        student[23].setTest2(40);
        student[23].setTest3(80);

        student[24] = new Student("Jide");
        student[24].setTest1(61);
        student[24].setTest2(59);
        student[24].setTest3(80);

        student[25] = new Student("Fine");
        student[25].setTest1(60);
        student[25].setTest2(60);
        student[25].setTest3(20);
        
        student[26] = new Student("Dine");
        student[26].setTest1(60);
        student[26].setTest2(60);
        student[26].setTest3(80);

        student[27] = new Student("Wine");
        student[27].setTest1(62);
        student[27].setTest2(34);
        student[27].setTest3(82);

        student[28] = new Student("Sun");
        student[28].setTest1(60);
        student[28].setTest2(40);
        student[28].setTest3(80);

        student[29] = new Student("Moon");
        student[29].setTest1(61);
        student[29].setTest2(59);
        student[29].setTest3(80);

        for(int i = 0; i < student.length; i++){
            System.out.println("Student number: " + (i + 1));
            System.out.println("Name: " + student[i].getName());
            System.out.println("Test 1 score: " + student[i].getTest1());
            System.out.println("Test 2 score: " + student[i].getTest2());
            System.out.println("Test 3 score: " + student[i].getTest3());
            System.out.println("Average: " + student[i].testAvg());
            if(student[i].testAvg() >= 60 && student[i].testAvg() <= 100){
                if((student[i].getTest1() + student[i].getTest2()) / 2 < 60){
                    double newAvg = (student[i].getTest1() + student[i].getTest2()) / 2;
                    System.out.println("Student has an average of " + newAvg + " for the 2 first tests. This will now be the new total average of the student");
                    System.out.println("New average: " + newAvg);
                    System.out.println("Student has failed");
                    failedStudents++;
                }
                else{
                    System.out.println("Student has passed");
                    passedStudents++;
                }   
            }
            else{
                System.out.println("Student has failed");
                failedStudents++;
            }
            System.out.println();
        }
        System.out.println("There are " + passedStudents + " students who have passed");
        System.out.println("There are " + failedStudents + " students who have failed");
    }
}
