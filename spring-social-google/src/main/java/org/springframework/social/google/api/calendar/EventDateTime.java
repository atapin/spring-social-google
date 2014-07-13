package org.springframework.social.google.api.calendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.springframework.social.google.api.calendar.impl.TimeZoneDeserializer;
import org.springframework.social.google.api.calendar.impl.TimeZoneSerializer;

/**
 *
 * @author Andrey Atapin
 */
public class EventDateTime {
    
    @JsonFormat(shape = STRING, pattern = "yyyy-MM-dd")
    private Date date;
    
    @JsonFormat(shape = STRING, pattern="yyyy-MM-dd'T'HH:mm:ssX")
	private Date dateTime;
    
    @JsonSerialize(using = TimeZoneSerializer.class)
    @JsonDeserialize(using = TimeZoneDeserializer.class)
    private TimeZone timeZone;

    private EventDateTime() { }

    public Date getDate() {
        return date;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }
    
    public Date getActualDateTime() {
        if(date == null) {
            return dateTime;
        } else {
            return date;
        }
    }
    
    /**
     * Constructs a datetime object for an all-day event
     * @param date day
     * @return datetime object
     */
    public static EventDateTime ofDate(Date date) {
        final EventDateTime eventDateTime = new EventDateTime();
        eventDateTime.date = date;
        return eventDateTime;
    }
    
    public static EventDateTime ofDate(Date date, TimeZone timeZone) {
        final EventDateTime eventDateTime = new EventDateTime();
        eventDateTime.date = date;
        eventDateTime.timeZone = timeZone;
        return eventDateTime;
    }
    
    /**
     * Constructs a datetime object for a regular event
     * @param date date and time
     * @return datetime object
     */
    public static EventDateTime ofTime(Date date) {
        final EventDateTime eventDateTime = new EventDateTime();
        eventDateTime.dateTime = date;
        return eventDateTime;
    }
    
    /**
     * Constructs a datetime object for a regular event
     * @param date date and time
     * @param timeZone time zone
     * @return datetime object
     */
    public static EventDateTime ofTime(Date date, TimeZone timeZone) {
        final EventDateTime eventDateTime = new EventDateTime();
        eventDateTime.dateTime = date;
        eventDateTime.timeZone = timeZone;
        return eventDateTime;
    }

    @Override
    public String toString() {
        final SimpleDateFormat shortFormat = new SimpleDateFormat("yyyy-MM-dd");
        final SimpleDateFormat longFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
        
        final StringBuilder sb = new StringBuilder("EventDateTime[");
        if(date != null) sb.append("date={").append(shortFormat.format(date)).append("}; ");
        if(dateTime != null) sb.append("dateTime={").append(longFormat.format(dateTime)).append("}; ");
        if(timeZone != null) sb.append("tz=").append(timeZone.getID());
        
        sb.append("]");
        return sb.toString();
    }
    
    
}
