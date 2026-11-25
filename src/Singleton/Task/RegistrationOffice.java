package Singleton.Task;

public class RegistrationOffice {

    private TicketManager manager = new TicketManager();

    public void issueTicket() {
        System.out.println("Office: " + manager.issueTicket());
    }
}
