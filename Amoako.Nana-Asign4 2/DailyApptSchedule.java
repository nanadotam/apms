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
    apptsForTheDay = new Appointment[NUM_SLOTS];
  }

  /**
   * A method to display the list of appointments for the day
   * In the format:
   *    time: appointment_info
   *    time: appointment_info ... etc
   * Any empty slots (null Appointments in the array) should be listed as Free
   */
  public void displayAppointments() {
    for (int i = 0; i < NUM_SLOTS; i++) {
      if (apptsForTheDay[i] == null) {
        System.out.println(TIMES[i] + ": Free");
      } else {
        System.out.println(TIMES[i] + ": " + apptsForTheDay[i].toString());
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
    if (whichSlot < 0 || whichSlot >= NUM_SLOTS || apptsForTheDay[whichSlot] != null) {
      return false;   // Slot already occupied
    } else {
      apptsForTheDay[whichSlot] = appt;
      return true; // User can add appointment successfully
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
    if (whichSlot < 0 || whichSlot >= NUM_SLOTS || apptsForTheDay[whichSlot] != null) {
      return false;
    } else {
    return addAppointment(whichSlot, new Appointment(n, v, p));
    }
  }

  /**
   * A method to add the given appointment to the schedule in any free timeslot.
   * @param appt represents the appointment object
   * @return the index of the chosen timeslot or -1 if no free timeslot exists.
   */
  public int addAppointment(Appointment appt) {
    for (int i = 0; i < NUM_SLOTS; i++) {
      if (apptsForTheDay[i] == null) {
        apptsForTheDay[i] = appt;
        return i;   // free slot found logic
      }
    }
    return -1;  // no slot found
  }

  /**
   * A method to add an appointment for the given person, venue and purpose
   * @param n represents the name of the student
   * @param v represents the location of the appointment
   * @param p represents the reason for the meeting
   * @return the index of the chosen timeslot or -1 if no free timeslot exists.
   */
  public int addAppointment(String n, String v, String p) {
    Appointment appt = new Appointment(n, v, p);
    return addAppointment(appt); 
  }

  /**
   * Remove the appointment in the given slot
   * @param slot the index of the timeslot
   * @return true if operation was successful and false if not
   */
  public boolean removeAppointment(int slot){
    if (slot < 0 || apptsForTheDay[slot] == null) {
      return false;   // no existing appointment exists in the slot 
    } else {
      apptsForTheDay[slot] = null;
      return true;
    }
  }

  /**
   * Remove the appointment corresponding to the given student name
   * @param n represents the name of the student
   * @return true if operation was successful and false if not
   */
  public boolean removeAppointment(String n){
      for (int i = 0; i < NUM_SLOTS; i++) {
        if (apptsForTheDay[i] != null && apptsForTheDay[i].getStudentName().equals(n)) {
          apptsForTheDay[i] = null;
          return true;    // Return true because the appointment was successfully removed
        }
      }
  return false;   // student has no existing appointments, found no match in all slots 
  }

  /**
   * A method to reschedule appointments.
   * If the new time slot is taken, the method will not remove the original appointment.
   * Method takes the student name, new slot and the new appointment as parameters. 
   * @param studentName The name of the student whose appointment is to be rescheduled.
   * @param newSlot The index of the new time slot for the appointment.
   * @param newAppt The new appointment details.
   * @return true if the appointment was successfully rescheduled, false otherwise.
   */
  public boolean rescheduleAppointment(String studentName, int newSlot, Appointment newAppt) {
    // Check if slot is free
    int currSlot = -1;
    if (newSlot < 0 ||newSlot >= NUM_SLOTS || apptsForTheDay[newSlot] == null) {
      return false;  // slot occupied
    }

    // else find the student's appointment
    for (int i = 0; i < NUM_SLOTS; i++) {
      if (apptsForTheDay[i] != null && apptsForTheDay[i].getStudentName().equals(studentName)){
        currSlot = i;
        break;
      }
    }

    if (currSlot == -1){
      return false;   // slot not found
    }
    
    apptsForTheDay[currSlot] = null;    // remove current appointment
    apptsForTheDay[newSlot] = newAppt;
    return true;    // new appointment rescheduled successfully
  
  }
}



