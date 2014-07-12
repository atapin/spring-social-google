package org.springframework.social.google.api.calendar.impl;

import org.springframework.social.google.api.calendar.EventStatus;
import org.springframework.social.google.api.impl.ApiEnumDeserializer;

/**
 *
 * @author aatapin
 */
public class EventStatusDeserializer extends ApiEnumDeserializer<EventStatus> {

    public EventStatusDeserializer(Class<EventStatus> type) {
        super(type);
    }

}
