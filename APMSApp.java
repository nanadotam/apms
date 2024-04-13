import java.util.Scanner;

public class APMSApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // initialize variables
        int user_choice;
        boolean continueLoop = false;

    
    // call the actual class here

    // do while loop here to make sure user inputs valid data type (integer
    do {
        System.out.println("Welcome to the Ashesi Parking System.");
        System.out.println("1) Staff");
        System.out.println("2) Student");
        System.out.println("3) Visitor");
        System.out.println("4) Exit");
        System.out.print("\nYour input: ");


        // try catch exception to check if user enters letter instead of a number
        try {
            // this line selects the integer from the options the user enters
            user_choice = Integer.parseInt(scanner.nextLine());
            if (user_choice == 4) {
                System.out.println("Thank you for using the Ashesi Parking system.");
                continueLoop = false;
                break; // Exit the loop and end the program
            }

            switch (user_choice) {
                case 1:
                    System.out.println("Enter your Staff ID: ");
                    String staffID = scanner.nextLine();
                    User user = new User(staffID, "staff");
                    user.verifyStaffID(staffID);    // Verify staff ID
                    // Display menu
                    user.displayMenu(staffID);
                    break;
                default:
                    System.out.println("Invalid Option. Please try again");
                    break;

            }
        } catch (NumberFormatException e) { 
            System.out.println("Invalid Inout. Please enter a number.");   //
        }
    } while (continueLoop);

    scanner.close();
}
}

            
            // case 2:
            //     System.out.println("Enter your parking permit.");
            //     String studentPermit = scanner.nextLine();
                
            //     studentPermit = studentPermit.toUpperCase();
            //     if(!studentPermit.startsWith("STU")){
            //         System.out.println("Invalid Parking Permit");
            //     } else{
            //         System.out.println("Where on campus are you going or which carpark do you wish to park at?");
            //         System.out.println("");
            //         String choice = scanner.nextLine();
            //         choice = choice.toUpperCase();

            //         if(choice.startsWith("FAB")){
            //             //pick from fablab array
            //         }else if(choice.startsWith("M")){
            //             //choose from the maincarpark array
                        
            //         }
            //     }

            //     // Reggie - see
            //     private static void handleParking(Scanner scanner) {
            //         Booking.displayAvailableSpots(); // Assuming Booking class has this static method to display spots
            //         System.out.println("Select a parking spot ID (e.g., MPC 01):");
            //         String spotId = scanner.nextLine();
            
            //         System.out.println("Select a time (e.g., 10am):");
            //         String time = scanner.nextLine();
            
            //         if (Booking.reserveParkingSpot(spotId, time)) {
            //             System.out.println("Parking reserved successfully for " + spotId + " at " + time);
            //         } else {
            //             System.out.println("Failed to reserve parking. Please try again or select a different spot/time.");
            //         }