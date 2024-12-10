package les2.appointment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AgendaDays agendaDays = new AgendaDays();
        Appointment Hondziek = new Appointment("kevin","doodZiek");
        Appointment Hondk = new Appointment("koby","SuperZiekkk");
        Agenda ag = new Agenda();
        agendaDays.setDate(new Date(2024-02-21));
        System.out.println(agendaDays.getDay());
        ag.add(Hondziek);
        ag.addUrgent(Hondk);
        ag.print();

    }
}
