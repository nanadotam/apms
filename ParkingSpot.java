public class ParkingSpot implements Bookable{
    private String spotID;
    private String location;       // e.g., fab-lab, admin car park, hostel car parks...
    private boolean isOccupied;
    private String type;    // e.g., disabled, general, staff...

    // Constructor
    ParkingSpot(String spotID, String location, boolean isOccupied, String type) {
        this.spotID = spotID;
        this.location = location;
        this.isOccupied = isOccupied;
        this.type = type;
    }

    // Getters
    public String getspotID() {
        return spotID;
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
    public void setspotID(String spotID) {
        this.spotID = spotID;
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

    // Bookable interface implementation
    // method allows user to book a car park spot if it's not already occupied,
    @Override
    public boolean book(){
        if (!this.isOccupied) {
            this.isOccupied = true;
            return true;
        } else {
            return false;
        }
    }

    // implemented methods to release the car from a parking spot
    @Override
    public void release() {
        isOccupied = false;
    }

}

