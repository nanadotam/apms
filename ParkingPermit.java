import java.time.LocalDate;

public class ParkingPermit {
    private String permitId;
    private String userId; // The ID of the User who owns this permit
    private LocalDate validFrom;
    private LocalDate validUntil;
    private String permitType; // e.g., "student", "staff", "visitor"

    // Constructor
    public ParkingPermit(String permitId, String userId, LocalDate validFrom, LocalDate validUntil, String permitType) {
        this.permitId = permitId;
        this.userId = userId;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.permitType = permitType;
    }

    // Getters
    public String getPermitId() {
        return permitId;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public String getPermitType() {
        return permitType;
    }

    

    // Setters
    public void setPermitId() {
        this.permitId = permitId;
    }


    public boolean isValidOn(LocalDate date) {
        return (date.isEqual(validFrom) || date.isAfter(validFrom)) && (date.isBefore(validUntil) || date.isEqual(validUntil));
    }

    public checkPermitId(String permitId){
        if(permitId.contains("-") || permitId.contains(" ")){}
    }


}
