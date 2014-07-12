package org.springframework.social.google.api.calendar;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.google.api.calendar.impl.EventVisibilityDeserializer;
import org.springframework.social.google.api.impl.ApiEnumSerializer;

/**
 *
 * @author Andrey Atapin
 */
@JsonSerialize(using = ApiEnumSerializer.class)
@JsonDeserialize(using = EventVisibilityDeserializer.class)
public enum EventVisibility {
    DEFAULT,
    PUBLIC,
    PRIVATE,
    CONFIDENTIAL
}
