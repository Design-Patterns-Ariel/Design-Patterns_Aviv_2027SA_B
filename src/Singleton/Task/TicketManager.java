package Singleton.Task;

public class TicketManager {

    private int nextNumber = 1;

    public int issueTicket() {
        return nextNumber++;
    }
}