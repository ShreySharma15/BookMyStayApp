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


