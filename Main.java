import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Booking.displayAvailableSpots();  // Display available spots and times

        System.out.println("Enter the parking spot ID from the list above:");
        String spotId = scanner.nextLine();
        System.out.println("Enter the time you want to reserve:");
        String time = scanner.nextLine();

        if (Booking.reserveParkingSpot(spotId, time)) {
            System.out.println("Parking reserved successfully!");
        } else {
            System.out.println("Failed to reserve parking. Please try again.");
        }

        scanner.close();
    }
}
