package agenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PastDateException extends Exception {
  public PastDateException(LocalDate date) {
    super(String.format("The appointment date %s is in the past and cannot be added.",
            date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
  }
}

