package dmg613.flydreamair;


public class FlyDreamAir {

    public static void main(String[] args) {
        
    }
    
    public static void generateTestData(){
        
        // Generate Flights
        Flight flight1 = new Flight(101, "New York", "London", 178);
        Flight flight2 = new Flight(1232, "London", "Sydney", 150);
        Flight flight3 = new Flight(045, "Sydney", "Brisbane", 100);
        Flight flight4 = new Flight(999, "Berlin", "Amsterdam", 90);
        Flight flight5 = new Flight(66, "Miami", "Lima", 70);
        Flight flight6 = new Flight(666, "Brisbane", "Dubai", 100);
        Flight flight7 = new Flight(676, "Hobart", "Wellington", 112);
        Flight flight8 = new Flight(324, "Darwin", "Perth", 300);
        
        // Generate Customers
        EconomyTicket ticket = new EconomyTicket("John Doe", 123);
        EconomyTicket ticket2 = new EconomyTicket("Jane Smith", 13);
        
        if (flight1.bookTicket(ticket)){
            System.out.println("Ticket purchased successfully!");
        }
        else{
            System.out.println("Error has occured.");
        }
        
        if (flight1.bookTicket(ticket2)){
            System.out.println("Ticket purchased successfully!");
        }
        else{
            System.out.println("Error has occured.");
        }
        
        
        
        flight5.printSeats();
        
        flight1.printPassengerList();
    }
}
