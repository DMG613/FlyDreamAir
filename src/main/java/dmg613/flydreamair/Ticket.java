
package dmg613.flydreamair;



public class Ticket {
    
    private String passengerName;
    private int seatNumber;
    // 

    // Constructor
    public Ticket(String passengerName, int seatNumber) {
        
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
    }

    // Accessors
    public String getPassengerName() {
        return passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    
}
