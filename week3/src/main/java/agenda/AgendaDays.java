package agenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AgendaDays {
    private final Map<LocalDate, Agenda> agendas = new HashMap<>();

    public void addDay(LocalDate date) {
        agendas.put(date, new Agenda());
    }

    public void addAppointment(LocalDate date, Appointment appointment) throws PastDateException {
        if (date.isBefore(LocalDate.now())) {
            throw new PastDateException(date);
        }else if (date.isEqual(LocalDate.now())) {
            agendas.get(date).addAppointment(appointment);
        }

    }

    public void showNextAppointment(LocalDate date) throws NoAppointmentException {
        Agenda agenda = agendas.get(date);

        if (agenda == null) {
            System.out.println("Geen agenda voor deze datum.");
            return;
        }

        Optional<Appointment> nextAppointment = agenda.getNextAppointment();

        if (nextAppointment.isPresent()) {
            System.out.println("Volgende afspraak: " + nextAppointment.get());
        } else {
           throw new NoAppointmentException(date);
        }
    }
}

