package Singleton.Task;

public class TicketManager {

    private static TicketManager ticketManager;
    private int nextNumber = 1;

    private TicketManager() {}

    public static TicketManager getTicketManager(){
        if(ticketManager==null)
            ticketManager= new TicketManager();
        return ticketManager;
    }
    public int issueTicket() {
        return nextNumber++;
    }
}