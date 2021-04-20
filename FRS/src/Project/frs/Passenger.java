package Project.frs;

public class Passenger {
    private static int idCounter = 0; //Making static so that can be accessed by all objects inside the class
    private int id;

    private static class Address {
        //Defining Attributes
        String street, city, state;

        //Address Constructor for subclass as Passenger and Address have Composition relationship
        //Passenger owns Address
        Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static class Contact {
        //Defining attributes
        String name, phone, email;

        //Contact subclass constructor, Again Contact and Passenger have Composition relationship
        //Passenger owns Contact
        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;

    public Passenger(String street, String city, String state, String name, String phone, String email) {
        this.id = ++idCounter; //Pre-increment so that next object will have +1 id number
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
    }

    public String getContactDetails() {
        return "Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email;
    }

    public static int getPassengerCount() {
        return idCounter;
    }
}
