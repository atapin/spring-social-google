package org.springframework.social.google.api.calendar;

import java.util.Date;
import java.util.TimeZone;
import org.springframework.social.google.api.query.ApiQueryBuilder;

/**
 *
 * @author aatapin
 */
public interface EventQueryBuilder extends ApiQueryBuilder<EventQueryBuilder, EventPage> {
    EventQueryBuilder timeMin(Date time);
    EventQueryBuilder timeMax(Date time);
    EventQueryBuilder timeZone(TimeZone timeZone);
    EventQueryBuilder timeZone(String timeZoneId);
    EventQueryBuilder query(String query);
}
