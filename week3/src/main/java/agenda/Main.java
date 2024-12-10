package agenda;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Oefening 2
        Agenda agenda = new Agenda();
        agenda.addAppointment(new Appointment("Klant A", "vaccinatie"));
        agenda.addAppointment(new Appointment("Klant B", "controle"));
        agenda.addAppointment(new Appointment("Klant C", "operatie"));

        agenda.showNextAppointment();

        agenda.addUrgentAppointment(new Appointment("Klant U", "dringende ingreep"));

        agenda.showNextAppointment();
        agenda.showNextAppointment();
        agenda.showNextAppointment();
        agenda.showNextAppointment();

        //Oefening 3
        LocalDate day1 = LocalDate.of(2023, 10, 2);
        LocalDate day2 = LocalDate.of(2023, 10, 3);
        LocalDate day3 = LocalDate.of(2023, 10, 4);
        LocalDate day4 = LocalDate.of(2023, 10, 5);
        LocalDate day5 = LocalDate.of(2023, 10, 6);

        AgendaDays agendaDays = new AgendaDays();
        agendaDays.addDay(day1);
        agendaDays.addDay(day2);
        agendaDays.addDay(day3);
        agendaDays.addDay(day4);
        agendaDays.addDay(day5);

        try {
            agendaDays.addAppointment(day1, new Appointment("Klant A", "vaccinatie"));
        } catch (PastDateException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.addAppointment(day1, new Appointment("Klant B", "controle"));
        } catch (PastDateException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.addAppointment(day1, new Appointment("Klant C", "operatie"));
        } catch (PastDateException e) {
            System.out.println(e.getMessage());
        }

        try {
            agendaDays.showNextAppointment(day1);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.showNextAppointment(day1);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.showNextAppointment(day1);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.showNextAppointment(day1);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.showNextAppointment(day2);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.showNextAppointment(day3);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.showNextAppointment(day4);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
        try {
            agendaDays.showNextAppointment(day5);
        } catch (NoAppointmentException e) {
            System.out.println(e.getMessage());
        }
    }
}
