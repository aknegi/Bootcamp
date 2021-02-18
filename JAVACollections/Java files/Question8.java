import java.text.SimpleDateFormat;
import java.util.Date;

public class Question8 {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : " + strDate);

    }
}
