import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class test {

    public static void main(String[] args) {
        String inputDateString = "19-11-2023";
        String outputDateFormat = "dd-MM-yyyy";

        double date = Double.valueOf(inputDateString);

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(outputDateFormat);

        LocalDate outputDateString = LocalDate.parse(inputDateString, inputFormatter);


        System.out.println("Input date string: " + inputDateString);
        System.out.println("Output date string: " + outputDateString);

        System.out.println(outputDateString.isBefore(LocalDate.now()));
    }
}
