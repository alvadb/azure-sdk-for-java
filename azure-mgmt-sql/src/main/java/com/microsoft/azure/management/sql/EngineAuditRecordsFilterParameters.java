/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import org.joda.time.DateTime;

/**
 * The EngineAuditRecordsFilterParameters model.
 */
public class EngineAuditRecordsFilterParameters {
    /**
     * The eventTime property.
     */
    private DateTime eventTime;

    /**
     * The showSystemLogs property.
     */
    private Boolean showSystemLogs;

    /**
     * The showServerRecords property.
     */
    private Boolean showServerRecords;

    /**
     * Get the eventTime value.
     *
     * @return the eventTime value
     */
    public DateTime eventTime() {
        return this.eventTime;
    }

    /**
     * Set the eventTime value.
     *
     * @param eventTime the eventTime value to set
     * @return the EngineAuditRecordsFilterParameters object itself.
     */
    public EngineAuditRecordsFilterParameters withEventTime(DateTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get the showSystemLogs value.
     *
     * @return the showSystemLogs value
     */
    public Boolean showSystemLogs() {
        return this.showSystemLogs;
    }

    /**
     * Set the showSystemLogs value.
     *
     * @param showSystemLogs the showSystemLogs value to set
     * @return the EngineAuditRecordsFilterParameters object itself.
     */
    public EngineAuditRecordsFilterParameters withShowSystemLogs(Boolean showSystemLogs) {
        this.showSystemLogs = showSystemLogs;
        return this;
    }

    /**
     * Get the showServerRecords value.
     *
     * @return the showServerRecords value
     */
    public Boolean showServerRecords() {
        return this.showServerRecords;
    }

    /**
     * Set the showServerRecords value.
     *
     * @param showServerRecords the showServerRecords value to set
     * @return the EngineAuditRecordsFilterParameters object itself.
     */
    public EngineAuditRecordsFilterParameters withShowServerRecords(Boolean showServerRecords) {
        this.showServerRecords = showServerRecords;
        return this;
    }

}