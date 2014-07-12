package org.springframework.social.google.api.calendar;

import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Andrey Atapin
 */
public interface CalendarOperations {
    
    CalendarPage findAllCalendars(String pageToken);
    
    Calendar findCalendar(String id);
    
    Event addEvent(String calendarId, Event event);

    EventPage findEvents(String calendarId, String pageToken);

    EventPage findEventsAfter(String calendarId, Date date, String pageToken);

    EventPage findEventsAfter(String calendarId, Date date, String timeZone, String pageToken);

    EventPage findEventsAfter(String calendarId, Date date, TimeZone timeZone, String pageToken);

    EventPage findEventsBefore(String calendarId, Date date, String pageToken);

    EventPage findEventsBefore(String calendarId, Date date, String timeZone, String pageToken);

    EventPage findEventsBefore(String calendarId, Date date, TimeZone timeZone, String pageToken);

    EventPage findEventsBetween(String calendarId, Date left, Date right, String pageToken);

    EventPage findEventsBetween(String calendarId, Date left, Date right, String timeZone, String pageToken);

    EventPage findEventsBetween(String calendarId, Date left, Date right, TimeZone timeZone, String pageToken);
}
