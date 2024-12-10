package les2.appointment;

public class Appointment {
    private String name;
    private String reason;

    Appointment(String name, String reason) {
        this.name = name;
        this.reason = reason;

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
