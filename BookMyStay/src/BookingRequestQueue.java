package src;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class- BookingRequestQueue
 * <p>
 * Use Case 5:Booking Request (FIFO)
 * <p>
 * Description: This clss manages booking requests using a queue
 * <p>
 * Requests are processed in the manner they are received
 */
public class BookingRequestQueue {
    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation){
        requestQueue.offer(reservation);
    }

    public Reservation getNextRequest(){
        return requestQueue.poll();
    }

    public boolean hasPendingRequests(){
        return !requestQueue.isEmpty();
    }
}
