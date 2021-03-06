/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.implementation;

import com.microsoft.azure.management.search.UnavailableNameReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output of check name availability API.
 */
public class CheckNameAvailabilityOutputInner {
    /**
     * A value indicating whether the name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isNameAvailable;

    /**
     * The reason why the name is not available. 'Invalid' indicates the name
     * provided does not match the naming requirements (incorrect length,
     * unsupported characters, etc.). 'AlreadyExists' indicates that the name
     * is already in use and is therefore unavailable. Possible values include:
     * 'Invalid', 'AlreadyExists'.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private UnavailableNameReason reason;

    /**
     * A message that explains why the name is invalid and provides resource
     * naming requirements. Available only if 'Invalid' is returned in the
     * 'reason' property.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the isNameAvailable value.
     *
     * @return the isNameAvailable value
     */
    public Boolean isNameAvailable() {
        return this.isNameAvailable;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public UnavailableNameReason reason() {
        return this.reason;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
