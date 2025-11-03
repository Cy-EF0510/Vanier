import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SupportSystem {
    private Queue<Ticket> openTickets;
    private Map<Integer, Ticket> allTickets;
    private Map<String, Integer> ticketsPerCustomer;
    private int nextTicketId = 1;

    public SupportSystem(){
        openTickets = new LinkedList<>();
        allTickets = new HashMap<>();
        ticketsPerCustomer = new HashMap<>();
    }

    public void createTicket(String customer, String issue){
        Ticket newTicket = new Ticket(nextTicketId, customer, issue);
        openTickets.add(newTicket);
        allTickets.put(nextTicketId, newTicket);
        if(!ticketsPerCustomer.containsKey(customer)){
            ticketsPerCustomer.put(customer, 1);
            nextTicketId++;
        }
        else if(ticketsPerCustomer.containsKey(customer)){
            ticketsPerCustomer.put(customer, ticketsPerCustomer.get(customer).intValue() + 1);
            nextTicketId++;
        }
        
    }

    public Ticket processNextTicket(){
        if(openTickets == null){
            return null;
        }
        else{
            Ticket temp = openTickets.poll();
            temp.setStatus(Status.CLOSED);
            return temp;
        }
    }

    public Ticket getTicketById(int ticketId){
        return allTickets.get(ticketId);
    }

    public void printCustomerSummary(){
        System.out.println("Header thing");
        for(Map.Entry<String, Integer> set : ticketsPerCustomer.entrySet()){
            System.out.println("Name: " + set.getKey() + " Number of tickets: " + set.getValue());
        }
    }

    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();

        system.createTicket("Alice ", " Printer is not working ");
        system.createTicket("Bob ", " Cannot connect to WiFi ");
        system.createTicket("Alice ", " Monitor is flickering ");
        system.createTicket("Charlie ", " Software license expired");
        system.createTicket("Bob ", " Mouse is broken ");

        System.out.println(" --- Processing Next Ticket ---");
        Ticket processedTicket1 = system.processNextTicket();
        System.out.println("Processed : " + processedTicket1 );
        System.out.println("----------------------------\n");


        System.out.println("--- Looking up Ticket ID 3 ---");
        Ticket foundTicket = system.getTicketById (3);
        System.out.println(" Found : " + foundTicket );
        System.out.println("----------------------------\n");

        System.out.println("--- Processing Next Ticket ---");
        Ticket processedTicket2 = system.processNextTicket();
        System.out.println("Processed : " + processedTicket2);
        System.out.println("----------------------------\n");

        System.out.println("--- Looking up Closed Ticket ID 1---");
        Ticket closedTicket = system.getTicketById(1);
        System.out.println("Found: " + closedTicket);
        System.out.println("-----------------------------------\n");

        system.printCustomerSummary();

    }
}
