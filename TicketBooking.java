package Easy;
import java.util.*;

public class TicketBooking {
	



	    static Scanner sc = new Scanner(System.in);

	    static String[] seats = {
	        "A1", "A2", "A3", "A4", "A5"
	    };

	    static boolean[] booked = new boolean[5];

	    public static void main(String[] args) {

	        while (true) {

	            System.out.println("\n--- Ticket Booking System ---");
	            System.out.println("1. View Seats");
	            System.out.println("2. Book Ticket");
	            System.out.println("3. Cancel Ticket");
	            System.out.println("4. Exit");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    viewSeats();
	                    break;

	                case 2:
	                    bookTicket();
	                    break;

	                case 3:
	                    cancelTicket();
	                    break;

	                case 4:
	                    System.out.println("Thank you!");
	                    return;

	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }

	    static void viewSeats() {

	        System.out.println("\nSeats:");

	        for (int i = 0; i < seats.length; i++) {

	            if (booked[i])
	                System.out.println(seats[i] + " - BOOKED");
	            else
	                System.out.println(seats[i] + " - AVAILABLE");
	        }
	    }

	    static void bookTicket() {

	        viewSeats();

	        System.out.print("Enter seat number: ");
	        String seat = sc.next();

	        for (int i = 0; i < seats.length; i++) {

	            if (seats[i].equalsIgnoreCase(seat)) {

	                if (booked[i]) {
	                    System.out.println("Seat already booked!");
	                } else {
	                    booked[i] = true;
	                    System.out.println(
	                        "Ticket booked successfully for " + seats[i]
	                    );
	                }

	                return;
	            }
	        }

	        System.out.println("Invalid seat number!");
	    }

	    static void cancelTicket() {

	        System.out.print("Enter seat number: ");
	        String seat = sc.next();

	        for (int i = 0; i < seats.length; i++) {

	            if (seats[i].equalsIgnoreCase(seat)) {

	                if (!booked[i]) {
	                    System.out.println("Seat is not booked!");
	                } else {
	                    booked[i] = false;
	                    System.out.println("Ticket cancelled!");
	                }

	                return;
	            }
	        }

	        System.out.println("Invalid seat number!");
	    }
	}


