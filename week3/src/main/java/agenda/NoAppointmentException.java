package agenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NoAppointmentException extends Exception {
  public NoAppointmentException(LocalDate date) {
    super(String.format("Er zijn geen afspraken voor %s.",
            date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
  }
}
