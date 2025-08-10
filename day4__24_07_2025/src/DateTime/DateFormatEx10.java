package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatEx10 {
	public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));
    }
}
