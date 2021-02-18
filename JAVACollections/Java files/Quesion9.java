import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Quesion9 {

    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = formatter.format(date);
        System.out.println("Date in Indian Timezone (IST) : " + IST);

        formatter.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = formatter.format(date);
        System.out.println("Date in PST Timezone : " + PST);
    }
}

