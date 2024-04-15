
import java.util.Scanner;
public class WeeklyApptSchedule{
   
   private DailyApptSchedule[] apptsForTheWeek = new DailyApptSchedule[NUM_DAYS];
   
   public static final int NUM_DAYS = 5;
   public static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", 
     "Thursday", "Friday"};
   
   public enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
   
   // No-arg constructor creates an array of DailyApptSchedule 
   // for the week
   public WeeklyApptSchedule()
   {
      // TO-DO
      for (int i = 0; i < NUM_DAYS; i++){
         apptsForTheWeek[i] = new DailyApptSchedule();
      }
   }
   
   // display weekly appointments
   // Display the set of appointsments for the week by showing
   // the schedule for each day.
   public void displayWeeklyAppointments() {
      // TO-DO
      for(int i = 0; i < NUM_DAYS; i++){
         System.out.println("Day: " + DAYS[i]);
         apptsForTheWeek[i].displayAppointments();
      }
   }
   
   // Add an appointment for a given timeslot on a given day.
   // Note: You may find it helpful to invoke day.ordinal()
   // ordinal() is a method automatically defined for enumerations 
   // it gives an "index" of a particular value in the enumeration.
   public boolean addAppointment(Appointment appt, Day day, int timeSlot){
     // TO-DO
     int daysIndex = day.ordinal();
     if(apptsForTheWeek[daysIndex].addAppointment(timeSlot, appt)){
      return true;
     }
     return false;
   }
   
   // Cancels (removes) the appointment in a given timeslot on
   // a given day
   public void cancelAppointment(Day day, int timeSlot) {
      // TO-DO 
      int daysIndex = day.ordinal();
     if(apptsForTheWeek[daysIndex].removeAppointment(timeSlot));
   }

   private static void bookAppointment(WeeklyApptSchedule weeklyApptSchedule){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter day (Monday/Tuesday/Wednesday/Thursday/Friday): ");
      String dayString = scanner.next();
      WeeklyApptSchedule.Day day = WeeklyApptSchedule.Day.valueOf(dayString.toUpperCase());
      System.out.print("Enter time slot (0-8): ");
      int TimeSlot =  scanner.nextint();
      System.out.print("Enter student name: ");
      String studentName = scanner.next();
      System.out.print("Enter venue: ");
      String venue = scanner.next();
      System.out.print("Enter purpose of meeting: ");
      String purpose = scanner.next();
      Appointment appt = new Appointment(studentName, venue, purpose);

      boolean booked = weeklySchedule.addAppointment(appt, day, timeSlot);
      if (booked){
         System.out.println("Appointment booked successfully");
      }
      else{
         System.out.println("Failed to book appointment. Timeslot may already have been booked. ");
      }
   }

   private static void cancelAppointment(WeeklyApptSchedule weeklySchedule){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter day (Monday/Tuesday/Wednesday/Thursday/Friday): ");
      String dayString = scanner.next();
      WeeklyApptSchedule.Day day = WeeklyApptSchedule.Day.valueOf(dayString.toUpperCase());
      System.out.print("Enter time slot (0-8): ");
      int TimeSlot =  scanner.nextint();
      weeklySchedule.cancelAppointment(day, timeSlot);
      System.out.println("Appointment Successfully Cancelled. ");

   }

   public static void main(String [] args){
      WeeklyApptSchedule weeklySchedule = new WeeklyApptSchedule();
      Scanner scanner = new Scanner(System.in);
      while (true){
         System.out.println("\nAppointment Management System");
         System.out.println("1. Book an appointment");
         System.out.println("2. Cancel Appointment");
         System.out.println("3. Display Appointment");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         if (choice == 1){
            bookAppointment(weeklySchedule);
         }
         else if (choice == 2){
            cancelAppointment(weeklySchedule);
         }
         else if (choice == 3){
            weeklySchedule.displayWeeklyAppointments();
         }
         else if (choice == 4){
            System.out.println("Exiting");
            scanner.close();
            break;
         }
         else{
            System.out.println("Invalid choice. Please try again. ");
         }
      }  
   }


}