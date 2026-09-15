package common.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SimpleDate {

    private GregorianCalendar base;

    private SimpleDate() {
        init(new GregorianCalendar());
    }

    /** Returns today's date. A convenient static factory method. */
    public static SimpleDate today() {
        return new SimpleDate();
    }

    private void init(GregorianCalendar cal) {
        this.base = trimToDays(cal);
    }

    private GregorianCalendar trimToDays(GregorianCalendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat().format(base.getTime());
    }
}
