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
 *
 * @author Andrey Atapin
 */
@JsonSerialize(using=ApiEnumSerializer.class)
@JsonDeserialize(using=AccessRoleDeserializer.class)
public enum AccessRole {
    OWNER,
    READER
}
