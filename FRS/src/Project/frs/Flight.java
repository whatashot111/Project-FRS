package Project.frs;

public class Flight {

    //Defining attributes
    private int capacity;
    private int bookedSeats;
    private String airline;
    private String flightNumber;

    //Flight Constructor (Parameterised)
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.flightNumber = airline;
        this.airline = flightNumber;

    }
    //All getters and setters to access private attributes

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }





    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }

    public void incrementBookingCounter() {
        bookedSeats++;
    }
}
