public class WeeklyApptSchedule{
   
   private DailyApptSchedule[] apptsForTheWeek;
   
   public static final int NUM_DAYS = 5;
   public static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", 
     "Thursday", "Friday"};
   public enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
   
   // No-arg constructor creates an array of DailyApptSchedule 
   // for the week
   public WeeklyApptSchedule()
   {
      apptsForTheWeek = new DailyApptSchedule[NUM_DAYS];
      for (int i = 0; i < NUM_DAYS; i++) {
         apptsForTheWeek[i] = new DailyApptSchedule();
      }
   }
   
   // display weekly appointments
   // Display the set of appointsments for the week by showing
   // the schedule for each day.
   public void displayWeeklyAppointments() {
      for (int i = 0; i < NUM_DAYS; i++) {
         System.out.println("Appointments for " + DAYS[i] + ":"  );
         apptsForTheWeek[i].displayAppointments();
         System.out.println();
      }
   }
   
   // Add an appointment for a given timeslot on a given day.
   // Note: You may find it helpful to invoke day.ordinal()
   // ordinal() is a method automatically defined for enumerations 
   // it gives an "index" of a particular value in the enumeration.
   public boolean addAppointment(Appointment appt, Day day, int timeSlot){
      // Using ordianal() to get the index of the array
      int index = day.ordinal();
      // Check if index is less than appointments for the week 
      if (index < apptsForTheWeek.length) {
         return apptsForTheWeek[index].addAppointment(timeSlot, appt);
      } else {
         return false;
      }
   }
   
   // Cancels (removes) the appointment in a given timeslot on
   // a given day
   public void cancelAppointment(Day day, int timeSlot) {
      int index = day.ordinal();    // similar to addAppointment
      if (index < apptsForTheWeek.length) {
         apptsForTheWeek[index].removeAppointment(timeSlot);  
      } else {
         System.out.println("Invalid. Appointment not found.");      // No matching day found in index
      }

   }

   // Reschedule method
   /**
    * A method to rechedule appointments.
    * Method takes the student name and the new appointment as parameters. This method searches for the 
    * student's appointment in the daily schedule and reschedules it with the new detais.
    * @param studentName  - The name of the student whose appointment needs to be rescheduled.
    * @param newSlot The index of the new time slot for the appointment.
    * @param newAppointment - The new appointment details.
    * @return true if the rescheduling is successful, false otherwise.
    */
   public boolean rescheduleAppointment(String studentName, int newSlot, Appointment newAppt) {
      boolean reschedule = false;
      for (int i = 0; i < NUM_DAYS; i++) {
         if (apptsForTheWeek[i].rescheduleAppointment(studentName, newSlot, newAppt)){
            reschedule = true;
            break;
         }
      }
      return reschedule;
   }
}