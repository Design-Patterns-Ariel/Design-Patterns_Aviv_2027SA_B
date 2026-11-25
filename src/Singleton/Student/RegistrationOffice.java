package Singleton.Student;

public class RegistrationOffice {

    private TicketManager manager = new TicketManager();

    public void issueTicket() {
        System.out.println("Office: " + manager.issueTicket());
    }
}
