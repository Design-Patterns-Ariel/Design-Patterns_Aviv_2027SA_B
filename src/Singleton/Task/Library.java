package Singleton.Task;

public class Library {

    private TicketManager manager = TicketManager.getTicketManager();

    public void issueTicket() {
        System.out.println("Library: " + manager.issueTicket());
    }
}