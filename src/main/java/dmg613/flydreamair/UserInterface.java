package dmg613.flydreamair;

import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void runUI() {
        
        boolean isRunning = true;

        while (isRunning) {
            
            displayMenuCustomer();
            int choice = getUserInput();

            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    upgradeTicket();
                    break;
                case 3:
                    displayPassengerList();
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using our flight ticket management system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }


    private static void displayMenuCustomer() {
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("-----------Welcome to FlyDreamAir's Customer Portal-----------\nPlease Choose An Option:");
        System.out.println("1. Book Tickets");
        System.out.println("2. Manage Purchased Tickets");
        System.out.println("3. Manage Account");
        System.out.println("4. Exit");
    }

    private static int getUserInput() {
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }

    private static void bookTicket() {
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.next();
        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();
        Ticket ticket = new EconomyTicket(passengerName, seatNumber);

        if (flight.bookTicket(ticket)) {
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Sorry, the flight is full. Ticket booking failed!");
        }
    }

    private static void upgradeTicket() {
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.next();

        for (Ticket ticket : flight.getTickets()) {
            if (ticket.getPassengerName().equals(passengerName)) {
                if (flight.upgradeTicket(ticket)) {
                    System.out.println("Ticket upgraded successfully!");
                } else {
                    System.out.println("Sorry, ticket upgrade failed!");
                }
                return;
            }
        }
        System.out.println("Sorry, passenger not found!");
    }

    private static void displayPassengerList() {
        System.out.println("Passenger List:");
        for (Ticket ticket : flight.getTickets()) {
            System.out.println(ticket.getPassengerName() + " - " + ticket.getClass().getSimpleName());
        }
    }
}
