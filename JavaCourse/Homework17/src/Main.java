import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }


    public static boolean isDateOdd(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        try {
            return LocalDate.ofInstant(formatter.parse(date).toInstant(), ZoneId.systemDefault()).getDayOfYear() % 2 == 0;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}