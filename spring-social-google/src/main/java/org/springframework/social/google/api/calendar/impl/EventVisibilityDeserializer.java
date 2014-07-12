package org.springframework.social.google.api.calendar.impl;

import org.springframework.social.google.api.calendar.EventVisibility;
import org.springframework.social.google.api.impl.ApiEnumDeserializer;

/**
 *
 * @author Andrey Atapin
 */
public class EventVisibilityDeserializer extends ApiEnumDeserializer<EventVisibility> {

    public EventVisibilityDeserializer(Class<EventVisibility> type) {
        super(type);
    }
    
}
