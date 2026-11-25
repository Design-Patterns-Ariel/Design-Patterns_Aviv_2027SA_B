package Singleton.Task;

public class RegistrationOffice {

    private TicketManager manager = TicketManager.getTicketManager();

    public void issueTicket() {
        System.out.println("Office: " + manager.issueTicket());
    }
}
