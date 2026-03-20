package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Class -  RoomAllocationService
 *
 * This class is responsible for confirming
 * booking requests and assigning rooms.
 *
 * It ensures:
 * - Each room ID is unique
 * - Inventory is updated immediately
 * - No room is double-booked
 *
 * @version 6.0
 */
public class RoomAllocationService {
    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService(){
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory){
        String roomType = reservation.getroomType();

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (!availability.containsKey(roomType) || availability.get(roomType) <= 0) {
            System.out.println("No " + roomType + " rooms available for " + reservation.getGuestName());
            return;
        }

        String roomId = generateRoomId(roomType);

        allocatedRoomIds.add(roomId);

        assignedRoomsByType.putIfAbsent(roomType, new HashSet<>());
        assignedRoomsByType.get(roomType).add(roomId);

        inventory.decrementRoom(roomType);
    }

    private String generateRoomId(String roomType) {
        int counter = 1;
        String roomId;

        do {
            roomId = roomType.substring(0, 2).toUpperCase() + counter;
            counter++;
        } while (allocatedRoomIds.contains(roomId));

        return roomId;
    }
}
