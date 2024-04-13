import java.util.Scanner;

public class User {
    private String userID;
    private String name;
    private String role;    // student, staff, visitor
    private Scanner input;  // created private scanner object for use in methods

    private static final String[] STAFF_IDS = {"STAFF001", "STAFF002", "STAFF003", "STAFF004","STAFF005", "STAFF006", "STAFF007", "STAFF008",
    "STAFF009", "STAFF010", "STAFF011", "STAFF012","STAFF013", "STAFF014", "STAFF015", "STAFF016","STAFF017", "STAFF018", "STAFF019", "STAFF020",
    "STAFF021", "STAFF022", "STAFF023", "STAFF024","STAFF025", "STAFF026", "STAFF027", "STAFF028", "STAFF029", "STAFF030"};


    private static final String[] STUDENT_IDS = {"STU00012024", "STU00022025", "STU00032026", "STU00042027","STU00052024", "STU00062025", "STU00072026", "STU00082027","STU00092024", "STU00102025", "STU00112026", "STU00122027",
    "STU00132024", "STU00142025", "STU00152026", "STU00162027","STU00172024", "STU00182025", "STU00192026", "STU00202027","STU00212024", "STU00222025", "STU00232026", "STU00242027",
    "STU00252024", "STU00262025", "STU00272026", "STU00282027","STU00292024", "STU00302025" };


    // Constructor
    public User(String userID, String role) {
        this.userID = userID;
        this.role = role;
        this.input = new Scanner(System.in);    // initializing the scanner to take inputs from users
    }

    // Getters
    public String getuserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setuserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

    // Verify Staff ID
    public boolean verifyStaffID(String staffID) {
        staffID = staffID.toUpperCase();
        // Check if the ID starts with "STAFF"
        if (staffID.startsWith("STAFF")) {
            // Check if the uppercase ID exists in the array of valid IDs
            return contains(STAFF_IDS, staffID);
        } else {
            return false; // Incorrect ID format
        }
    }

    // Verify Student ID
    public boolean verifyStudentID(String studentID) {
        studentID = studentID.toUpperCase();
        // Check if the ID starts with "STU"
        if (studentID.startsWith("STU")) {
            // Check if the uppercase ID exists in the array of valid IDs
            return contains(STUDENT_IDS, studentID);
        } else {
            return false; // Incorrect ID format
        }
    }


    // helper method
    // Boolean we created to check if an array exists in a list 
    private boolean contains(String[] array, String key) {
        for (String element : array) {
            if (element.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // new display menu
    public void displayMenu(){
        int choice;
        boolean continueMenu = true;
        System.out.println("1) Book Parking Spot");
        System.out.println("2) View Available Parking Spots");
        System.out.println("3) Cancel Booking");
        System.out.println("4) Report Violations");
        System.out.println("5) Go Back");
        while (continueMenu) {
            

            System.out.println("Your Choice: ");
            try{
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Book Parking Spot Menu");
                        System.out.println("_" * 35);
                        System.out.println("Enter Parking SPot ID:");
                        String spotID = input.nextLine();
                        if (Booking.bookSpot(spotID)) {
                            System.out.println("Spot Booked Successfully.");
                        } else {
                            System.out.println("Spot occupied. Please choose another one.");
                        }
                        break;
                        
    
                    case 2:
                        // viewAvailableSpots();
                        break;
                    case 3:
                        System.out.println("Cancel..");
                        break;
                    case 4:
                        System.out.println("Report...");
                        // reportViolation();   
                        break;
                    case 5:
                        continueMenu = false;
                        System.out.println("Returning back to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

    }



    // // TO BE DELETED

    // // Display menu for staff
    // public void displayMenu(boolean staffID) {
    //     Scanner input = new Scanner(System.in);

    //     do {
    //         System.out.println("\nMenu for " + role + ": " + name);
    //         switch (role.toLowerCase()) {
    //             case "staff":
    //                 System.out.println("1. View Parking Details");
    //                 System.out.println("2. Update Parking Details");
    //                 System.out.println("3. Exit");
    //                 break;
    //             case "student":
    //                 System.out.println("1. Check Permit Status");
    //                 System.out.println("2. Apply for Permit");
    //                 System.out.println("3. Exit");
    //                 break;
    //             case "visitor":
    //                 System.out.println("1. Register Vehicle");
    //                 System.out.println("2. Pay for Parking");
    //                 System.out.println("3. Exit");
    //                 break;
    //         }
    //         System.out.print("Enter your choice: ");

    //         try {
    //             choice = Integer.parseInt(input.nextLine());

    //             if (choice == 3) {
    //                 System.out.println("Exiting...");
    //                 break;
    //             } else {
    //                 performAction(choice);
    //             }
    //         } catch (NumberFormatException e) {
    //             System.out.println("Invalid input! Please enter a number only.");
    //         }
    //     } while (true);
    // }

    // Perform actions based on the choice
    private void performAction(int choice) {
        System.out.println("Performing action for choice " + choice + " for a " + role);
        // Implement specific actions based on role and choice here
    
    input.close();
}
}
