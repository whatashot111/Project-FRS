package Project.frs;

public class RegularTicket extends Ticket {

    //Attributes
    private String specialServices;

    //Constructor
    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {

        //Calling Parent class Constructor

        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }
    //Getters
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
