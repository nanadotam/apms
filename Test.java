public class Test {
    public static void main(String[] args) {
        // Example of creating and using a Vehicle
        Vehicle vehicle = new Vehicle("ABC123", true);  // corrected to include both parameters
        System.out.println("Vehicle License Plate: " + vehicle.getLicensePlate());

        // Example of creating a User
        User user = new User("userID123", "John Doe", "staff");
        System.out.println("User Role: " + user.getRole());

        // Example of managing a parking spot
        ParkingSpot spot = new ParkingSpot("spotID1", "near entrance", false, "general");
        System.out.println("Parking Spot Type: " + spot.getType());

        // Assume more complex interactions and integrations here
    }
}
