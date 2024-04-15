/**
 * A class to represent the appointment schedule for a given day.
 * Each day is assumed to have hour-long timeslots starting at 8am and
 * with the final timeslot starting at 4pm
 **/
public class DailyApptSchedule {

  private Appointment[] apptsForTheDay;

  public static final int NUM_SLOTS = 9;
  public static final String[] TIMES = {"8am", "9am", "10am", "11am", 
                                        "12noon", "1pm", "2pm", "3pm", "4pm"};

  // No-arg onstructor creates an empty schedule for a day
  public DailyApptSchedule() {
    // TO-DO
    apptsForTheDay =  new Appointment[NUM_SLOTS];
  }

  /**
   * A method to display the list of appointments for the day
   * In the format:
   *    time: appointment_info
   *    time: appointment_info ... etc
   * Any empty slots (null Appointments in the array) should be listed as Free
   */
  public void displayAppointments() {
    // TO-DO
    for (int i = 0; i < NUM_SLOTS; i++){
      System.out.println("Time Slot: " + TIMES[i]);
      if (apptsForTheDay[i] != null){
        apptsForTheDay[i].displayDetails();
      }
    }
  }

  /**
   * A method to add the given appointment to the schedule in the specified timeslot
   * @param whichSlot represents the index of the timeslot (Eg. 0 -> 8am, 1 -> 9am, ...)
   * @param appt represents the appointment object
   * @return true if it was successful and false if not successful
   */
  public boolean addAppointment(int whichSlot, Appointment appt) {
    // TO-DO
    if (apptsForTheDay[whichSlot] != null){
        return false;
    }
    else{
        apptsForTheDay[whichSlot] = appt;
        return true;
    }
  }

  /**
   * A method to add an appointment for the given person, venue and purpose to the schedule in the specified timeslot.
   * @param whichSlot represents the index of the timeslot (Eg. 0 -> 8am, 1 -> 9am, ...)
   * @param n represents the name of the student
   * @param v represents the location of the appointment
   * @param p represents the reason for the meeting
   * @return true if it was successful and false if not successful (i.e. if the given slot is invalid or taken)
   */
  public boolean addAppointment(int whichSlot, String n, String v, String p) {
    // TO-DO
    if (apptsForTheDay[whichSlot] != null){
        return false;
    }
    else{
        Appointment appt = new Appointment (n, v, p);
        apptsForTheDay[whichSlot] = appt;
        return true;
    }
  }

  /**
   * A method to add the given appointment to the schedule in any free timeslot.
   * @param appt represents the appointment object
   * @return the index of the chosen timeslot or -1 if no free timeslot exists.
   */
  public int addAppointment(Appointment appt) {
    // TO-DO
    int i = 0;
    while(i < NUM_SLOTS){
        if (apptsForTheDay[i] == null){
            apptsForTheDay[i] = appt;
            return i;
        }
        i += 1;
    }
    return -1;
  }

  /**
   * A method to add an appointment for the given person, venue and purpose
   * @param n represents the name of the student
   * @param v represents the location of the appointment
   * @param p represents the reason for the meeting
   * @return the index of the chosen timeslot or -1 if no free timeslot exists.
   */
  public int addAppointment(String n, String v, String p) {
    // TO-DO
    int i = 0;
    while(i < NUM_SLOTS){
        if (apptsForTheDay[i] == null){
            Appointment appt = new Appointment(n, v, p);
            apptsForTheDay[i] = appt;
            return i;
        }
        i += 1;
    }
    return -1;
  }

  /**
   * Remove the appointment in the given slot
   * @param slot the index of the timeslot
   * @return true if operation was successful and false if not
   */
  public boolean removeAppointment(int slot){
    // TO-DO
    apptsForTheDay[slot] = null;
    return true;
  }

  /**
   * Remove the appointment corresponding to the given student name
   * @param n represents the name of the student
   * @return true if operation was successful and false if not
   */
  public boolean removeAppointment(String n){
      // TO-DO
      for (int i = 0; i < NUM_SLOTS; i ++){
        if (apptsForTheDay[i].getStudentName().equals(n)){
            apptsForTheDay[i] = null;
            return true;
        }
      }
      return false;
  }
  
  
  /**
   * Checks if the name of the student provided has already booked an appointment
   * Gets the appointment the student had created
   * checks if the new appoitnment the student wanted to book is free and if it is, 
   * it deletes the name of the student from the old appointment and sets it to the new one
   * but if it isnt, it keeps the students name at the old place
   */
  public boolean rescheduleAppointment(int slot, String n){
    for (int i = 0; i < NUM_SLOTS; i++){
        if (apptsForTheDay[i].getStudentName().equals(n)){
            Appointment appt = apptsForTheDay[i];

            if (apptsForTheDay[slots] == null){
                apptsForTheDay[slots] = appt;
                apptsForTheDay[i] = null;
                return true;
            }

            else{
                return false;
            }
        }
    }
    return false;
  }
}





