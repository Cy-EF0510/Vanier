enum Status{
    OPEN, CLOSED;
}
public class Ticket {
    private int ticketId;
    private String customerName;
    private String issueDescription;
    private Status status;

    public Ticket() {
        ticketId = 0;
        customerName = null;
        issueDescription = null;
        status = Status.OPEN;
    }

    public Ticket(int ticketId, String customerName, String issueDescription) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
        status = Status.OPEN;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", customerName=" + customerName + ", issueDescription="
                + issueDescription + ", status=" + status + "]";
    }

    
}
