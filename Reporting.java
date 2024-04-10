import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Reporting{
    //Constructor
    public Reporting(){}

    public void reportViolation(String description, String userId, int numberPlate){
        Scanner reportIssue = new Scanner(System.in);
        System.out.println("Enter violation description: ");
        System.out.println("Enter user ID: ");
        System.out.println("Enter the user's number plate: ");
        String userInput = reportIssue.nextLine();


    }

    public int userFines(int userId, int numberPlate){
        return 0;
    }

    public void reportMaintenanceIssue(String location){}

    public Report[] viewReportsByDate(Date date){
        return new Report[i]
    }
}