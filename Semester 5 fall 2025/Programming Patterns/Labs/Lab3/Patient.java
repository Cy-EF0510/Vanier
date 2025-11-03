public class Patient implements Comparable<Patient>{
    private String name;
    private int urgencyLevel;

    public Patient(String name, int urgencyLevel){
        this.name = name;
        this.urgencyLevel = urgencyLevel;
    }

    public int compareTo(Patient o){
        return Integer.compare(this.urgencyLevel, o.urgencyLevel);
    }

    public String toString(){
        return "Urgency Level: " + urgencyLevel + " Patient: " + name;
    }
}
