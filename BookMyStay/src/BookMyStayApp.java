package src;

import java.util.Scanner;

/**
 *
 * MAIN CLASS – HotelBookingApp
 *
* Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * This class demonstrates how confirmed
 * bookings can be cancelled safely.
 *
 * Inventory is restored and rollback
 * history is maintained.
 *
 * @author Shrey Sharma
 * @version 10.0
 */

public class BookMyStayApp {
     public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        RoomInventory inventory = new RoomInventory();

        CancellationService cancellationService = new CancellationService();

        String reservationId = "Single-1";
        String roomType = "Single";

        cancellationService.registerBooking(reservationId, roomType);

        cancellationService.cancelBooking(reservationId, inventory);

        cancellationService.showRollbackHistory();

        System.out.println(
                "\nUpdated Single Room Availability: "
                        + inventory.getRoomAvailability().get("Single")
        );
    }
}


