package ls.surfspot.service;

import org.springframework.stereotype.Service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

@Service
public class DateFormatValidator {

    public boolean isDateFormatValid(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT));
            return true;
        }catch (DateTimeException e) {
            return false;
        }
    }

    public LocalDate dateFormatter(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT));
    }

    public boolean isDateInRange(LocalDate formattedDate) {
        if(formattedDate.isBefore(LocalDate.now()) || formattedDate.isAfter(LocalDate.now().plusDays(6))) {
            return false;
        }
        return true;
    }
}
