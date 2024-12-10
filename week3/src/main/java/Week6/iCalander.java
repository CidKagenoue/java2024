package Week6;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class iCalander {
    public static void main(String[] args) {

            String summary = "Team Meeting";
            String startDate = "20240415T100000Z";
            String endDate = "20240415T110000Z";
            String location = "Conference Room 1";
            String description = "Monthly team meeting";


            StringBuilder icalContent = new StringBuilder();
            icalContent.append("BEGIN:VCALENDAR\n");
            icalContent.append("VERSION:2.0\n");
            icalContent.append("BEGIN:VEVENT\n");
            icalContent.append("SUMMARY:").append(summary).append("\n");
            icalContent.append("DTSTART:").append(startDate).append("\n");
            icalContent.append("DTEND:").append(endDate).append("\n");
            icalContent.append("LOCATION:").append(location).append("\n");
            icalContent.append("DESCRIPTION:").append(description).append("\n");
            icalContent.append("END:VEVENT\n");
            icalContent.append("END:VCALENDAR");


            try (BufferedWriter writer = new BufferedWriter(new FileWriter("meeting.ics"))) {
                writer.write(icalContent.toString());
                System.out.println("iCalendar file created: meeting.ics");
            } catch (IOException e) {
                System.err.println("Error writing the iCalendar file: " + e.getMessage());
            }
        }
    }


