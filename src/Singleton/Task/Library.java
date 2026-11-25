package Singleton.Task;

public class Library {

    private TicketManager manager = new TicketManager();

    public void issueTicket() {
        System.out.println("Library: " + manager.issueTicket());
    }
}