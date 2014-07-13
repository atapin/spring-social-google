package org.springframework.social.google.api.calendar.impl;

import java.util.Date;
import java.util.TimeZone;
import org.springframework.social.google.api.calendar.Calendar;
import org.springframework.social.google.api.calendar.CalendarOperations;
import org.springframework.social.google.api.calendar.CalendarPage;
import org.springframework.social.google.api.calendar.CalendarQueryBuilder;
import org.springframework.social.google.api.calendar.Event;
import org.springframework.social.google.api.calendar.EventPage;
import org.springframework.social.google.api.calendar.EventQueryBuilder;
import org.springframework.social.google.api.impl.AbstractGoogleApiOperations;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author aatapin
 */
public class CalendarTemplate extends AbstractGoogleApiOperations implements CalendarOperations {
    
    private final static String CALENDAR_BASE_URL = "https://www.googleapis.com/calendar/v3";
    private final static String CALENDAR_LIST_URL = "https://www.googleapis.com/calendar/v3/users/me/calendarList";
    private final static String CALENDAR_FIND_URL = "https://www.googleapis.com/calendar/v3/calendars/";
    
    private final static String EVENTS = "/events";
    
    public CalendarTemplate(RestTemplate restTemplate, boolean isAuthorized) {
        super(restTemplate, isAuthorized);
    }

    private CalendarQueryBuilder calendarQuery() {
        return new CalendarQueryBuilderImpl(CALENDAR_LIST_URL, CalendarPage.class, restTemplate);
    }
    
    private EventQueryBuilder eventQuery(final String calendarId) {
        return new EventQueryBuilderImpl(CALENDAR_FIND_URL + calendarId + EVENTS, EventPage.class, restTemplate);
    }
    
    @Override
    public CalendarPage findAllCalendars(String pageToken) {
        return calendarQuery().getPage();
    }

    @Override
    public Calendar findCalendar(String id) {
        return getEntity(CALENDAR_FIND_URL + id, Calendar.class);
    }
    
    @Override
    public EventPage findEvents(String calendarId, String pageToken) {
        final StringBuilder sb = new StringBuilder(CALENDAR_FIND_URL).append(calendarId).append(EVENTS);
        if(!StringUtils.isEmpty(sb)) {
            sb.append("?pagetToken=").append(pageToken);
        }
        
        return getEntity(sb.toString(), EventPage.class);
    }
    
    @Override
    public EventPage findEventsAfter(String calendarId, Date date, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(date)
                .getPage();
    }
    
    @Override
    public EventPage findEventsAfter(String calendarId, Date date, String timeZone, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(date)
                .timeZone(timeZone)
                .getPage();
    }
    
    @Override
    public EventPage findEventsAfter(String calendarId, Date date, TimeZone timeZone, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(date)
                .timeZone(timeZone)
                .getPage();
    }
    
    @Override
    public EventPage findEventsBefore(String calendarId, Date date, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMax(date)
                .getPage();
    }
    
    @Override
    public EventPage findEventsBefore(String calendarId, Date date, String timeZone, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(date)
                .timeZone(timeZone)
                .getPage();
    }
    
    @Override
    public EventPage findEventsBefore(String calendarId, Date date, TimeZone timeZone, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(date)
                .timeZone(timeZone)
                .getPage();
    }
    
    @Override
    public EventPage findEventsBetween(String calendarId, Date left, Date right, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(left)
                .timeMax(right)
                .getPage();
    }
    
    @Override
    public EventPage findEventsBetween(String calendarId, Date left, Date right, String timeZone, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(left)
                .timeMax(right)
                .timeZone(timeZone)
                .getPage();
    }
    
    @Override
    public EventPage findEventsBetween(String calendarId, Date left, Date right, TimeZone timeZone, String pageToken) {
        return eventQuery(calendarId)
                .fromPage(pageToken)
                .timeMin(left)
                .timeMax(right)
                .timeZone(timeZone)
                .getPage();
    }
    
    @Override
    public Event addEvent(String calendarId, Event event) {
        return saveEntity(CALENDAR_FIND_URL + calendarId + EVENTS, event);
    }
}
