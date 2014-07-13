package org.springframework.social.google.api.calendar.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.TimeZone;

/**
 *
 * @author aatapin
 */
public class TimeZoneDeserializer extends JsonDeserializer<TimeZone> {

    public TimeZoneDeserializer() { }
    
    @Override
    public TimeZone deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        final String stringValue = jp.getValueAsString();
        return TimeZone.getTimeZone(stringValue);
    }

}
