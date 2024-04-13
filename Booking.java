public class Booking {
    private ParkingSpot[] parkingForTheDay;  // Assuming 'Parking' class exists, otherwise this will cause an error.

    public static final String[] multiPurposeCarpark = {"MPC 01", "MPC 02", "MPC 03", "MPC 04", "MPC 05", 
                                                        "MPC 06", "MPC 07", "MPC 08", "MPC 09", "MPC 10"};
    public static final String[] multiPurposeCarparkTime = {"12am", "1am", "2am", "3am", "4am", "5am", "6am",
                                                            "7am", "8am", "9am", "10am", "11am", "12noon", 
                                                            "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", 
                                                            "8pm", "9pm", "10pm", "11pm"};

    public static final String[] mainAdministrationCarpark = {"ADMIN 01", "ADMIN 02", "ADMIN 03", "ADMIN 04", "ADMIN 05", 
                                                            "ADMIN 06", "ADMIN 07", "ADMIN 08", "ADMIN 09", "ADMIN 10",
                                                            "ADMIN 11", "ADMIN 12", "ADMIN 13", "ADMIN 14", "ADMIN 15",
                                                            "ADMIN 16", "ADMIN 17", "ADMIN 18", "ADMIN 19", "ADMIN 20"};
    public static final String[] mainAdministrationCarparkTime = {"12am", "1am", "2am", "3am", "4am", "5am", "6am",
                                                                "7am", "8am", "9am", "10am", "11am", "12noon", 
                                                                "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", 
                                                                "8pm", "9pm", "10pm", "11pm"};

    public static final String[] mainStudentsCarpark = {"ADMIN-STU 01", "ADMIN-STU 02", "ADMIN-STU 03", "ADMIN-STU 04", "ADMIN-STU 05", 
                                                        "ADMIN-STU 06", "ADMIN-STU 07", "ADMIN-STU 08", "ADMIN-STU 09", "ADMIN-STU 10",
                                                        "ADMIN-STU 11", "ADMIN-STU 12", "ADMIN-STU 13", "ADMIN-STU 14", "ADMIN-STU 15"};
    public static final String[] mainStudentsCarparkTime = {"12am", "1am", "2am", "3am", "4am", "5am", "6am",
                                                            "7am", "8am", "9am", "10am", "11am", "12noon", 
                                                            "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", 
                                                            "8pm", "9pm", "10pm", "11pm"};

    public static final String[] upperHostelsCarpark = {"HOSTEL-UP 01", "HOSTEL-UP 02", "HOSTEL-UP 03", "HOSTEL-UP 04", "HOSTEL-UP 05", 
                                                        "HOSTEL-UP 06", "HOSTEL-UP 07", "HOSTEL-UP 08", "HOSTEL-UP 09", "HOSTEL-UP 10",
                                                        "HOSTEL-UP 11", "HOSTEL-UP 12", "HOSTEL-UP 13", "HOSTEL-UP 14", "HOSTEL-UP 15"};
    public static final String[] upperHostelsCarparkTime = {"12am", "1am", "2am", "3am", "4am", "5am", "6am",
                                                            "7am", "8am", "9am", "10am", "11am", "12noon", 
                                                            "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", 
                                                            "8pm", "9pm", "10pm", "11pm"};

    public static final String[] lowerHostelsCarpark = {"HOSTEL-DOWN 01", "HOSTEL-DOWN 02", "HOSTEL-DOWN 03", "HOSTEL-DOWN 04", "HOSTEL-DOWN 05", 
                                                        "HOSTEL-DOWN 06", "HOSTEL-DOWN 07", "HOSTEL-DOWN 08", "HOSTEL-DOWN 09", "HOSTEL-DOWN 10",
                                                        "HOSTEL-DOWN 11", "HOSTEL-DOWN 12", "HOSTEL-DOWN 13", "HOSTEL-DOWN 14", "HOSTEL-DOWN 15",
                                                        "HOSTEL-DOWN 16", "HOSTEL-DOWN 17", "HOSTEL-DOWN 18", "HOSTEL-DOWN 19", "HOSTEL-DOWN 20"};
    public static final String[] lowerHostelsCarparkTime = {"12am", "1am", "2am", "3am", "4am", "5am", "6am",
                                                            "7am", "8am", "9am", "10am", "11am", "12noon", 
                                                            "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", 
                                                            "8pm", "9pm", "10pm", "11pm"};

    //implementing a booking method (new)
    public Booking() {
        // constructor
        this.parkingForTheDay = new ParkingSpot[50];    // limiting the parking spots to 50 to test | to be changhed to actual values later
        
        // using a for each loop for efficiency

        // spot initializer for multipurpose car park
        int i = 0;
        for (String spot : multiPurposeCarpark) {
            parkingForTheDay[i++] = new ParkingSpot(spot, "Multi-Purpose Building", false, "General");
        }

        // @ Elsie
        // repeat method for all 5 car parks

    // bookSpot method
    public boolean bookSpot (String spotId){
        for (ParkingSpot spot : parkingForTheDay) {
            if (spot.getspotId().equals(spotId) && !spot.getIsOccupied()) {
                return spot.book();
            }
        }
        return false;
    }

    public static boolean reserveParkingSpot(String spotId, String time) {
        // Dummy implementation for reservation - logic here
        // In a real scenario, check if the spotId and time are available, then reserve them
        System.out.println("Reserved " + spotId + " at " + time);
        return true; // Assuming reservation is always successful for this example
    }

    public static void displayAvailableSpots() {
        System.out.println("Available parking spots:");
        for (String spot : multiPurposeCarpark) {
            System.out.print(spot + " ");
        }
        System.out.println("\nAvailable times:");
        for (String time : multiPurposeCarparkTime) {
            System.out.print(time + " ");
        }
        System.out.println();
    }
    }
}

