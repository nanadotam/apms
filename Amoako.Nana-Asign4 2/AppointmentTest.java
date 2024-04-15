// Test Class for Appointment
public class AppointmentTest {

    public static void main(String[] args) {
        Appointment appt1 = new Appointment("Kwabena", "FI Office", "Office Hours");
        Appointment appt2 = new Appointment("Jan", "D Lab", "Midsem Review");
        Appointment appt3 = new Appointment("Stephan", "RB 100", "Office Hours");

        DailyApptSchedule dailySchedule = new DailyApptSchedule();
        WeeklyApptSchedule weeklySchedule = new WeeklyApptSchedule();

        dailySchedule.addAppointment(0, appt1);
        dailySchedule.addAppointment(1, appt2);

        System.out.println("Daily Schedule:");
        dailySchedule.displayAppointments();

        weeklySchedule.addAppointment(appt1, WeeklyApptSchedule.Day.MONDAY, 0);
        weeklySchedule.addAppointment(appt2, WeeklyApptSchedule.Day.TUESDAY, 1);
        weeklySchedule.addAppointment(appt3, WeeklyApptSchedule.Day.WEDNESDAY, 2);

        System.out.println("\nWeekly Schedule Before Changes:");
        weeklySchedule.displayWeeklyAppointments();

        Appointment newApptForJan = new Appointment("Jan", "Open Park", "Leisure Meeting");
        weeklySchedule.rescheduleAppointment("Jan", 3, newApptForJan);

        weeklySchedule.cancelAppointment(WeeklyApptSchedule.Day.WEDNESDAY, 2);

        System.out.println("Weekly Schedule After Changes:");
        weeklySchedule.displayWeeklyAppointments();
    }
}
