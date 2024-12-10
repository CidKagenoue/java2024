package les2.appointment;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Agenda {

    Deque<Appointment> appointments = new LinkedList<Appointment>();


   public void add(Appointment a ) {
       appointments.offerLast(a);

   }

   public void addUrgent(Appointment a) {
       appointments.offerFirst(a);

   }

   public void print() {
       for (Appointment a : appointments) {
           System.out.println(a);
       }

   }

    @Override
    public String toString() {
        return "Agenda{" +
                "appointments=" + appointments +
                '}';
    }
}
