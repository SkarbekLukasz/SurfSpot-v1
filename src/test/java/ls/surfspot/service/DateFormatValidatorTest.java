package ls.surfspot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateFormatValidatorTest {

    @Test
    public void shouldCheckDateAndReturnFalse() {
        //given
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        String date = "01-03-2022";
        //when
        boolean result = dateFormatValidator.isDateFormatValid(date);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldCheckDateAndReturnTrue() {
        //given
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        String date = "2023-02-10";
        //when
        boolean result = dateFormatValidator.isDateFormatValid(date);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldCheckIfDateIsInRangeAndReturnTrue() {
        //given
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        LocalDate date = LocalDate.now().plusDays(3);

        //when
        boolean result = dateFormatValidator.isDateInRange(date);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldCheckIfDateIsInRangeAndReturnFalse() {
        //given
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        LocalDate date = LocalDate.now().plusDays(7);

        //when
        boolean result = dateFormatValidator.isDateInRange(date);

        //then
        Assertions.assertFalse(result);
    }
}
