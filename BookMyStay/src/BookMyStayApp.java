package src;

/**
 *
 * MAIN CLASS – HotelBookingApp
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * This class demonstrates how
 * confirmed bookings are stored
 * and reported.
 *
 * The system maintains an ordered
 * audit trail of reservations.
 *
 * @author Shrey Sharma
 * @version 6.0
 */

public class BookMyStayApp {
    public static void main(String[] args) {


        System.out.println("Add-On Service Selection Demo");

        AddOnServiceManager serviceManager = new AddOnServiceManager();

        String reservationId = "RES101";

        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 2000);
        AddOnService pickup = new AddOnService("Airport Pickup", 800);

        serviceManager.addService(reservationId, breakfast);
        serviceManager.addService(reservationId, spa);
        serviceManager.addService(reservationId, pickup);

        double totalCost = serviceManager.calculateTotalServiceCost(reservationId);

        System.out.println("Total add-on service cost: ₹" + totalCost);
    }
}


