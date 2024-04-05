public class Vehicle {
    private String licensePlate;
    private boolean requiresDisabledAccess;

    // Constructor 
    public Vehicle (String licensePlate, boolean requiresDisabledAccess) {
        this.licensePlate = licensePlate;
    }

    // Getters
    public String getLicensePlate(){
        return licensePlate;
    }

    public boolean isRequiresDisabledAccess() {
        return requiresDisabledAccess;
    }

    // Setters
    public void setLicensePlate (String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setRequiresDisabledAccess(boolean requiresDisabledAccess) {
        this.requiresDisabledAccess = requiresDisabledAccess;
    }

}
