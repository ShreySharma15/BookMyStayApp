package src;

import java.util.Scanner;

/**
 *
 * MAIN CLASS – HotelBookingApp
 *
* Use Case 12: Data Persistence & System Recovery
 *
 * Description:
 * This class demonstrates how system state
 * can be restored after an application restart.
 *
 * Inventory data is loaded from a file
 * before any booking operations occur.
 *
 * @author Shrey Sharma
 * @version 12.0
 */

public class BookMyStayApp {
     public static void main(String[] args) {

        System.out.println("System Recovery");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        String filePath = "inventory.txt";

        persistenceService.loadInventory(inventory, filePath);

        System.out.println("\nCurrent Inventory:");

        System.out.println("Single: " +
                inventory.getRoomAvailability().get("Single"));

        System.out.println("Double: " +
                inventory.getRoomAvailability().get("Double"));

        System.out.println("Suite: " +
                inventory.getRoomAvailability().get("Suite"));

        persistenceService.saveInventory(inventory, filePath);
    }
}


