public class ParkingSpot {
    private String spotId;
    private String location;       // e.g., fab-lab, admin car park, hostel car parks...
    private boolean isOccupied;
    private String type;    // e.g., disabled, general, staff...

    // Constructor
    ParkingSpot(String spotId, String location, boolean isOccupied, String type) {
        this.spotId = spotId;
        this.location = location;
        this.isOccupied = isOccupied;
        this.type = type;
    }

    // Getters
    public String getSpotId() {
        return spotId;
    }

    public String getLocation() {
        return location;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setType(String type) {
        this.type = type;
    }
}
