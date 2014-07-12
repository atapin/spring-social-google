package org.springframework.social.google.api.calendar;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.google.api.calendar.impl.EventStatusDeserializer;
import org.springframework.social.google.api.impl.ApiEnumSerializer;

/**
 *
 * @author Andrey Atapin
 */
@JsonSerialize(using=ApiEnumSerializer.class)
@JsonDeserialize(using=EventStatusDeserializer.class)
public enum EventStatus {
    CONFIRMED,
    TENTATIVE,
    CANCELLED
}
