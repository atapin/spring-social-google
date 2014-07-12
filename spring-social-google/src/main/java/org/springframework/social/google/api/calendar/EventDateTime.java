package org.springframework.social.google.api.calendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.TimeZone;
import org.springframework.social.google.api.calendar.impl.TimeZoneDeserializer;
import org.springframework.social.google.api.calendar.impl.TimeZoneSerializer;

/**
 *
 * @author aatapin
 */
public class EventDateTime {
    
    @JsonFormat(shape = STRING, pattern = "yyyy-MM-dd")
    private Date date;
    
    @JsonFormat(shape = STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'")
	private Date dateTime;
    
    @JsonSerialize(using = TimeZoneSerializer.class)
    @JsonDeserialize(using = TimeZoneDeserializer.class)
    private TimeZone timeZone;

    public EventDateTime() { }

    public Date getDate() {
        return date;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }
    
    
    
}
