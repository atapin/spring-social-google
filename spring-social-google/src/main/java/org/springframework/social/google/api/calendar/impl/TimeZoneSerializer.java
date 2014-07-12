package org.springframework.social.google.api.calendar.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.TimeZone;

/**
 *
 * @author Andrey Atapin
 */
public class TimeZoneSerializer extends JsonSerializer<TimeZone> {

    @Override
    public void serialize(TimeZone value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        jgen.writeString(value.getID());
    }

}
