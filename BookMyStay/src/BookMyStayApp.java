package src;

/**
 *
 * MAIN CLASS – HotelBookingApp
 * <p>
 * Use Case 5: Booking Request (First-Come-First-Served)
 * <p>
 * Description:
 * This class demostrates how booking requests are p
 * accepted and queued in a fair order
 * <p>
 * No room allocation is performed here
 *
 * @author Shrey Sharma
 * @version 5.0
 */

public class BookMyStayApp {
    public static void main(String[] args) {

        System.out.println("Booking Request Queue");

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        Reservation r1 = new Reservation("Shrey", "Single");
        Reservation r2 = new Reservation("Triya", "Double");
        Reservation r3 = new Reservation("Aditya", "Suite");

        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        while(bookingQueue.hasPendingRequests()){
            Reservation r = bookingQueue.getNextRequest();
            System.out.println("Processing booking for Guest: " + r.getGuestName() + ", Room Type: " + r.getroomType());
        }
    }
}


