package dmg613.flydreamair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Flight {
    
    private int flightNumber;
    private String destination;
    private String departure;
    private int capacity;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private HashMap<Integer, Ticket> seats = new HashMap<>();

    public Flight(int flightNumber, String destination, String departure, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.capacity = capacity;
        this.generateSeats();
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public HashMap<Integer, Ticket> getSeats() {
        return seats;
    }
    
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void generateSeats() {
        
        int numberID = 0;
        while(numberID <= capacity){
            
            seats.put(numberID, null);
            numberID++;    
        }
    }
    
    public void printSeats() {
        
        for(Map.Entry<Integer, Ticket> entry : seats.entrySet()){
            
            int seatNumber = entry.getKey();
            String availability;
            if (entry.getValue() == null){
                availability = "AVAILABLE";
            }
            else{
                availability = "UNAVAILABLE";
            }
            
            System.out.printf("Seat Number: %3d\t Availability: %13s\n", seatNumber, availability);
        }
        System.out.print("\n\n");
    }
    
    
    public boolean bookTicket(Ticket ticket) {
        
        if (seats.containsKey(ticket.getSeatNumber())) {
            
            if(seats.get(ticket.getSeatNumber()) == null){
                
                tickets.add(ticket);
                seats.put(ticket.getSeatNumber(), ticket);
                return true;
            }
            else{
                
                System.out.print("That seat is already taken.\n");
                return false;
            }
            
        } 
        else {
            System.out.print("That seat does not exist for this flight.\n");
            return false;
        }
    }

    
    public boolean upgradeTicket(Ticket ticket) {
        
        if (ticket instanceof EconomyTicket) {
            int index = tickets.indexOf(ticket);
            tickets.set(index, new BusinessTicket(ticket.getPassengerName(), ticket.getSeatNumber()));
            return true;
        } else {
            return false;
        }
    }

    public void printPassengerList() {
        
        System.out.printf("Passenger List for Flight: %d\nDeparture: %s\nDestination: %s\n", this.getFlightNumber(), this.getDeparture(), this.getDestination());
        
        for (Ticket ticket : tickets) {
            System.out.printf("Passenger: %s \tSeat Number: %d\n", ticket.getPassengerName(), ticket.getSeatNumber());
        }
    }
}
