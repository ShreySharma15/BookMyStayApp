package src;

/**
 *
 * MAIN CLASS – HotelBookingApp
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Description:
 * This class demonstrates how booking requests are
 * confirmed and rooms are allocated successfully
 *
 * Consumes requests in FIFO order and updates inventory
 *
 * @author Shrey Sharma
 * @version 6.0
 */

public class BookMyStayApp {
    public static void main(String[] args) {


        System.out.println("Room Allocation Processing");

        RoomInventory inventory = new RoomInventory();

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        bookingQueue.addRequest(new Reservation("Shrey", "Single"));
        bookingQueue.addRequest(new Reservation("Triya", "Double"));
        bookingQueue.addRequest(new Reservation("Aditya", "Suite"));

        RoomAllocationService allocationService = new RoomAllocationService();

        while (bookingQueue.hasPendingRequests()) {

            Reservation request = bookingQueue.getNextRequest();

            allocationService.allocateRoom(request, inventory);

            System.out.println(
                    "Booking confirmed for Guest: " +
                            request.getGuestName() +
                            ", Room ID: Assigned"
            );
        }
    }
}


