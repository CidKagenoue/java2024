package les2.appointment;

import java.util.Date;

public class AgendaDays {
    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDay() {
        return date = new Date(date.getDay());
    }

    @Override
    public String toString() {
        return "AgendaDays{" +
                "date=" + date +
                '}';
    }
}
