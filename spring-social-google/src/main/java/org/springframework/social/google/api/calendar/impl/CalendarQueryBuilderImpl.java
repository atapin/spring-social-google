package org.springframework.social.google.api.calendar.impl;

import org.springframework.social.google.api.calendar.AccessRole;
import org.springframework.social.google.api.calendar.CalendarPage;
import org.springframework.social.google.api.calendar.CalendarQueryBuilder;
import org.springframework.social.google.api.query.impl.ApiQueryBuilderImpl;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Andrey Atapin
 */
public class CalendarQueryBuilderImpl extends ApiQueryBuilderImpl<CalendarQueryBuilder, CalendarPage> implements CalendarQueryBuilder {

    public CalendarQueryBuilderImpl(String feedUrl, Class<CalendarPage> type, RestTemplate restTemplate) {
        super(feedUrl, type, restTemplate);
    }

    @Override
    public CalendarQueryBuilder minAccessRole(AccessRole accessRole) {
        return appendQueryParam("minAccessRole", accessRole.toString().toLowerCase());
    }

    @Override
    public CalendarQueryBuilder showDeleted(boolean showDeleted) {
        return appendQueryParam("showDeleted", showDeleted);
    }

    @Override
    public CalendarQueryBuilder showHidden(boolean showHidden) {
        return appendQueryParam("showHidden", showHidden);
    }

    
}
