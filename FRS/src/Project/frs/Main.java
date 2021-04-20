package Project.frs;

public class Main {

    public static void main(String[] args) {
        //Passing Arguments/Parameters
        Ticket regularTicket = new RegularTicket("54321", "Jabalpur",
                "Chennai", "DepartureDateTime", "ArrivalDateTime",
                "13B", 6500, false, null, null, "lunch/dinner");

        Ticket touristTicket = new TouristTicket("12345", "India", "Russia",
                "DepartureDateTime", "ArrivalDateTIme",
                "10A", 21000, false, null, null,
                "Russia Beach", new String[]{""});

        //Calling methods
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
    //Printing details
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
