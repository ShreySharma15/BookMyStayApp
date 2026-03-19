package src;
/**
 * 
 * MAIN CLASS – UseCase1HotelBookingApp
 * 
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * Demonstrates room initialization using domain models.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message to the user
 * - Confirms that the system has started successfully
 *
 * @author shrey Sharma
 * @version 2.1
 */

public class BookMyStayApp {
       public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("Current Room Availability:");
        System.out.println(inventory.getRoomAvailability());

        inventory.updateAvailability("Single", 4);

        System.out.println("\nUpdated Room Availability:");
        System.out.println(inventory.getRoomAvailability());
    }
}


