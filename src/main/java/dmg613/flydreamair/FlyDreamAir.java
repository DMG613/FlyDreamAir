package dmg613.flydreamair;
import java.util.*;


public class FlyDreamAir {
    
    ArrayList<CustomerAccount> customers = new ArrayList<CustomerAccount>();

    
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
    
    // Returns user within company where login matches
    public CustomerAccount checkLogin(String username, String password){
        
        for(CustomerAccount u: customers){
            if (u.username.equals(username)){
                
                if(u.password.equals(password)){
                    return u;
                }
            } 
        }
        return null;
    }
    
    
    
}
