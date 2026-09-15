package common.datetime;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;
import static java.time.format.FormatStyle.SHORT;

import java.time.LocalDate;
import java.time.ZoneId;

public class SimpleDate {

    private final LocalDate date;

    private SimpleDate(LocalDate date) {
        this.date = date;
    }

    /** Returns today's date. A convenient static factory method. */
    public static SimpleDate today() {
        return new SimpleDate(LocalDate.now(ZoneId.systemDefault()));
    }

    @Override
    public String toString() {
        return date.format(ofLocalizedDate(SHORT));
    }
}
