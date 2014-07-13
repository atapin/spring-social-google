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

    public void setStatus(EventStatus status) {
        this.status = status;
    }

    public void setStart(EventDateTime start) {
        this.start = start;
    }

    public void setEnd(EventDateTime end) {
        this.end = end;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setVisibility(EventVisibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event[");
        
        if(start != null) sb.append("start=").append(start.toString()).append(";");
        if(start != null) sb.append("end=").append(start.toString()).append(";");
        
        sb.append("]");
        return sb.toString();
    }
    
    
}
