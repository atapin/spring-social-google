/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.google.api.calendar;

import org.springframework.social.google.api.query.ApiQueryBuilder;

/**
 *
 * @author Andrey Atapin
 */
public interface CalendarQueryBuilder extends ApiQueryBuilder<CalendarQueryBuilder, CalendarPage> {
    CalendarQueryBuilder minAccessRole(AccessRole accessRole);
    CalendarQueryBuilder showDeleted(boolean showDeleted);
    CalendarQueryBuilder showHidden(boolean showHidden);
}
