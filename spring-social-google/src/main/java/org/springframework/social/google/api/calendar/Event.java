package org.springframework.social.google.api.calendar;

import org.springframework.social.google.api.ApiEntity;

/**
 * Model class representing a calendar event
 * @author Andrey Atapin
 */
public class Event extends ApiEntity {
    
    private EventStatus status;
    
    private String htmlLink;
    
    private EventDateTime start;
    
    private EventDateTime end;
    
    private String summary;
    
    private EventVisibility visibility;
    
    public Event() { }

    public EventStatus getStatus() {
        return status;
    }

    public String getHtmlLink() {
        return htmlLink;
    }

    public EventDateTime getStart() {
        return start;
    }

    public EventDateTime getEnd() {
        return end;
    }

    public String getSummary() {
        return summary;
    }

    public EventVisibility getVisibility() {
        return visibility;
    }
    
}
