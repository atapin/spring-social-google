package org.springframework.social.google.api.calendar.impl;

import java.util.Date;
import java.util.TimeZone;
import org.springframework.social.google.api.calendar.EventPage;
import org.springframework.social.google.api.calendar.EventQueryBuilder;
import org.springframework.social.google.api.query.impl.ApiQueryBuilderImpl;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Andrey Atapin
 */
public class EventQueryBuilderImpl extends ApiQueryBuilderImpl<EventQueryBuilder, EventPage> implements EventQueryBuilder{

    public EventQueryBuilderImpl(String feedUrl, Class<EventPage> type, RestTemplate restTemplate) {
        super(feedUrl, type, restTemplate);
    }

    @Override
    public EventQueryBuilder timeMin(Date time) {
        return appendQueryParam("timeMin", time);
    }

    @Override
    public EventQueryBuilder timeMax(Date time) {
        return appendQueryParam("timeMax", time);
    }

    @Override
    public EventQueryBuilder timeZone(TimeZone timeZone) {
        return appendQueryParam("timeZone", timeZone.getID());
    }

    @Override
    public EventQueryBuilder timeZone(String timeZoneId) {
        return appendQueryParam("timeZone", timeZoneId);
    }

    @Override
    public EventQueryBuilder query(String query) {
        return appendQueryParam("q", query);
    }

}
