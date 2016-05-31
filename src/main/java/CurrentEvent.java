/**
 * Created by Володимир on 20.05.2016.
 */

import org.apache.log4j.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;


public class CurrentEvent {

    private static final Logger LOGGER = Logger.getLogger(CurrentEvent.class);
    public static final Locale LOCALE = Locale.getDefault();
    public static final ResourceBundle SOURCE = ResourceBundle.getBundle("language", LOCALE);
    final GregorianCalendar TIME;

    public CurrentEvent() {
        TIME = new GregorianCalendar();
    }

    public CurrentEvent(GregorianCalendar time) {
        TIME = time;
    }

    public String getPeriod() {

        if (TIME.get(Calendar.HOUR_OF_DAY) > 6 && TIME.get(Calendar.HOUR_OF_DAY) < 9 || TIME.get(Calendar.HOUR_OF_DAY) == 6) {
            LOGGER.info("shown the message: " + SOURCE.getString("morning") + "\nLocalisation:" + LOCALE);
            return SOURCE.getString("morning");
        } else if (TIME.get(Calendar.HOUR_OF_DAY) > 9 && TIME.get(Calendar.HOUR_OF_DAY) < 19 || TIME.get(Calendar.HOUR_OF_DAY) == 9) {
            LOGGER.info("shown the message: " + SOURCE.getString("day") + "\nLocalisation:" + LOCALE);
            return SOURCE.getString("day");
        } else if (TIME.get(Calendar.HOUR_OF_DAY) > 19 && TIME.get(Calendar.HOUR_OF_DAY) < 23 || TIME.get(Calendar.HOUR_OF_DAY) == 19) {
            LOGGER.info("shown the message: " + SOURCE.getString("evening") + "\nLocalisation:" + LOCALE);
            return SOURCE.getString("evening");
        } else
            LOGGER.info("shown the message: " + SOURCE.getString("night") + "\nLocalisation:" + LOCALE);
        return SOURCE.getString("night");
    }
}