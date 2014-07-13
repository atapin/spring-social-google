/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.google.api.calendar;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.google.api.calendar.impl.AccessRoleDeserializer;
import org.springframework.social.google.api.impl.ApiEnumSerializer;

/**
 * User's access role to a calendar
 * @author Andrey Atapin
 */
@JsonSerialize(using=ApiEnumSerializer.class)
@JsonDeserialize(using=AccessRoleDeserializer.class)
public enum AccessRole {
    /**
     * No access.
     */
    NONE,
    /**
     * The user has ownership of the calendar. 
     * This role has all of the permissions of the writer role 
     * with the additional ability to see and manipulate ACLs
     */
    OWNER,
    /**
     * The user has read access to the calendar.
     * Private events will appear to users with reader access,
     * but event details will be hidden.
     */
    READER,
    /**
     * The user has read access to free/busy information.
     */
    FREE_BUSY_READER,
    /**
     * The user has read and write access to the calendar. 
     * Private events will appear to users with writer access,
     * and event details will be visible.
     */
    WRITER
}
