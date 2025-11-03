import java.util.PriorityQueue;

public class PatientMain {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();

        Patient patient1 = new Patient("John", 3);        
        Patient patient2 = new Patient("Max", 1);
        Patient patient3 = new Patient("Lucy", 5);
        Patient patient4 = new Patient("Sally", 2);
        Patient patient5 = new Patient("Bob", 4);   
        
        pq.add(patient1);        
        pq.add(patient2);
        pq.add(patient3);
        pq.add(patient4);
        pq.add(patient5);  
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
