import java.util.LinkedList;
import java.util.Queue;

public class PrintMain {
    public static void main(String[] args) {
        Queue<PrintJob> job = new LinkedList<PrintJob>();

        PrintJob job1 = new PrintJob("Report.docx");
        PrintJob job2 = new PrintJob("Presentation.pptx");
        PrintJob job3 = new PrintJob("Spreadsheet.xlsx");
        PrintJob job4 = new PrintJob("file.txt");
        PrintJob job5 = new PrintJob("Program.java");

        job.add(job1);
        job.add(job2);
        job.add(job3);
        job.add(job4);
        job.add(job5);

        while(!job.isEmpty()){
            System.out.println("Printing: " + job.poll());
        }
    }
}
