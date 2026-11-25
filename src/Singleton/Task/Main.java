package Singleton.Task;

public class Main {

    public static void main(String[] args) {

        RegistrationOffice office = new RegistrationOffice();
        Library library = new Library();
//        TicketManager ticketManager = new TicketManager();
        office.issueTicket();
        library.issueTicket();
        office.issueTicket();
        library.issueTicket();
        office.issueTicket();
    }
}