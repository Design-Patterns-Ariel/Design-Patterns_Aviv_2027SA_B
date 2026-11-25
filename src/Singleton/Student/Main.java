package Singleton.Student;

public class Main {

    public static void main(String[] args) {

        RegistrationOffice office = new RegistrationOffice();
        Library library = new Library();

        office.issueTicket();
        library.issueTicket();
        office.issueTicket();
        library.issueTicket();
        office.issueTicket();
    }
}