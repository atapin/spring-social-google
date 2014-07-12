package org.springframework.social.google.api.calendar.impl;

import org.springframework.social.google.api.calendar.AccessRole;
import org.springframework.social.google.api.impl.ApiEnumDeserializer;

/**
 *
 * @author aatapin
 */
public class AccessRoleDeserializer extends ApiEnumDeserializer<AccessRole> {

    public AccessRoleDeserializer(Class<AccessRole> type) {
        super(type);
    }

}
