import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EventManagement {
    private boolean isEventActive;
    private Map<Integer, Event> events = new HashMap<>();

    // Constructor
    public EventManagement(boolean isEvent) {
        this.isEventActive = isEvent;
    }

    // Getter
    public boolean getIsEvent() {
        return isEventActive;
    }

    // Setter
    public void setIsEvent(boolean isEvent) {
        this.isEventActive = isEvent;
    }

    // Method to schedule an event
    public void scheduleEvent(int eventId, Date eventDate, String parkingZone) {
        if (!events.containsKey(eventId)) {
            events.put(eventId, new Event(eventId, eventDate, parkingZone));
            System.out.println("Event scheduled for: " + eventDate.toString() + " at " + parkingZone);
        } else {
            System.out.println("Event already scheduled with this ID.");
        }
    }

    // Method to cancel an event
    public void cancelEvent(int eventId) {
        if (events.containsKey(eventId)) {
            events.remove(eventId);
            System.out.println("Event with ID " + eventId + " has been canceled.");
        } else {
            System.out.println("No event found with ID " + eventId);
        }
    }

    // Nested class to represent an Event
    private class Event {
        private int eventId;
        private Date eventDate;
        private String parkingZone;

        Event(int eventId, Date eventDate, String parkingZone) {
            this.eventId = eventId;
            this.eventDate = eventDate;
            this.parkingZone = parkingZone;
        }

        // Additional methods can be implemented here to interact with parking management
    }
}
