package agenda;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

public class Agenda {
    private final Deque<Appointment> appointments = new ArrayDeque<>();


    public void addAppointment(Appointment appointment) {
        appointments.offerLast(appointment);
    }

    public void addUrgentAppointment(Appointment appointment) {
        appointments.offerFirst(appointment);
    }

    public void showNextAppointment() {
        Appointment appointment = appointments.poll();
        if(appointment == null) {
            System.out.println("Er zijn geen afspraken");
        } else {
            System.out.println(appointment);
        }

    }

    public Optional<Appointment> getNextAppointment() {
        return Optional.ofNullable(appointments.peek());
    }
}

