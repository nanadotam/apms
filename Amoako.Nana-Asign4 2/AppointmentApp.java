import java.util.Scanner;

public class AppointmentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Appointment appointment = null;
        int user_choice;

        do {
            System.out.println("Welcome to the Tutoring/Office-hours Appointment Portal. Kindly select a number from the menu below.");
            System.out.println("1) Make an appointment");
            System.out.println("2) View Appointment");
            System.out.println("3) Change Appointment");
            System.out.println("4) Exit");
            System.out.println("Enter your choice: ");
            user_choice = scanner.nextInt();
            scanner.nextLine();

            switch (user_choice) {
                case 1:
                    System.out.println("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the venue: ");
                    String venue = scanner.nextLine();
                    System.out.println("Enter the purpose: ");
                    String purpose = scanner.nextLine();
                    appointment = new Appointment(name, venue, purpose);
                    System.out.println("Your appointment has been made successfully!");
                    break;
                case 2:
                    if (appointment != null) {
                        System.out.println("Here are your appointment details: ");
                        appointment.displayDetails();
                    } else {
                        System.out.println("You have no appointments yet.");
                    }
                    break;
                case 3:
                    if (appointment != null) {
                        System.out.println("Enter new student name: ");
                        String newName = scanner.nextLine();
                        System.out.println("Enter the new venue: ");
                        String newVenue = scanner.nextLine();
                        System.out.println("Enter the new purpose: ");
                        String newPurpose = scanner.nextLine();
                        appointment.setStudentName(newName);
                        appointment.setVenue(newVenue);
                        appointment.setPurpose(newPurpose);
                        System.out.println("The appointment details have been updated successfully!");
                    } else {
                        System.out.println("You have no appointments yet. Please create one.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Portal");
                    System.out.println(".");
                    System.out.println("..");
                    System.out.println("...");
                    System.out.println("Thank you for using this service!");
                    break;
                default:
                    System.out.println("Invalid Option. Kindly try again.");
            }
        } while (user_choice != 4);

        scanner.close(); 
    }
}
