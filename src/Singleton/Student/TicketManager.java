package Singleton.Student;

public class TicketManager {

    private int nextNumber = 1;

    public int issueTicket() {
        return nextNumber++;
    }
}