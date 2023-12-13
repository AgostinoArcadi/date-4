import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime dateModify = date.plusYears(1).minusMonths(1).plusDays(7);

        String dateString = dateModify.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY));
        System.out.println(dateString);



    }
}
