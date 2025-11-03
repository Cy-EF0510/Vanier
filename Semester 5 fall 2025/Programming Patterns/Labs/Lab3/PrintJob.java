public class PrintJob {
    private String documentName;

    public PrintJob(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public String toString() {
        return documentName;
    }
}
