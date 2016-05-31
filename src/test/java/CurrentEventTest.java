/**
 * Created by Володимир on 20.05.2016.
 */


import org.apache.log4j.*;
        import org.junit.Assert;
        import org.junit.Test;

        import java.util.Calendar;
        import java.util.GregorianCalendar;

public class CurrentEventTest {

    private static final Logger logger = Logger.getLogger(CurrentEventTest.class);

    @Test
    public void MorningStartTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 6, 00, 00));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("morning"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void DayStartTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 9, 00, 00));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("day"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void EveningStartTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 19, 00, 00));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("evening"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void NightStartTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 23, 00, 00));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("night"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void NightEndTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 5, 59, 59));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("night"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void EveningEndTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 22, 59, 59));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("evening"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void DayEndTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 18, 59, 59));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("day"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void MorningEndTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 8, 59, 59));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("morning"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void BeginMorningTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 6, 00, 01));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("morning"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void BeginDayTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 9, 00, 01));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("day"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void BeginEveningTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 19, 00, 01));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("evening"), currentEvent.getPeriod());
        logger.info("TEST");
    }

    @Test
    public void BeginNightTest() {
        CurrentEvent event = new CurrentEvent();
        CurrentEvent currentEvent = new CurrentEvent(new GregorianCalendar(event.TIME.get(Calendar.YEAR),
                event.TIME.get(Calendar.MONTH), event.TIME.get(Calendar.DAY_OF_MONTH), 23, 00, 01));
        Assert.assertEquals(CurrentEvent.SOURCE.getString("night"), currentEvent.getPeriod());
        logger.info("TEST");
    }
    @Test
    public void getPeriod_test() {
        CurrentEvent event = new CurrentEvent();
        if (event.getPeriod().equals(CurrentEvent.SOURCE.getString("morning"))) {
            Assert.assertEquals(CurrentEvent.SOURCE.getString("morning"), event.getPeriod());
            logger.info("TEST");
        } else if (event.getPeriod().equals(CurrentEvent.SOURCE.getString("day"))) {
            Assert.assertEquals(CurrentEvent.SOURCE.getString("day"), event.getPeriod());
            logger.info("TEST");
        } else if (event.getPeriod().equals(CurrentEvent.SOURCE.getString("evening"))) {
            Assert.assertEquals(CurrentEvent.SOURCE.getString("evening"), event.getPeriod());
            logger.info("TEST");
        } else if (event.getPeriod().equals(CurrentEvent.SOURCE.getString("night"))) {
            Assert.assertEquals(CurrentEvent.SOURCE.getString("night"), event.getPeriod());
            logger.info("TEST");
        } else {
            Assert.fail("Incorrect Time Error!");
            logger.info("Incorrect Time Error!");
        }
    }
}

