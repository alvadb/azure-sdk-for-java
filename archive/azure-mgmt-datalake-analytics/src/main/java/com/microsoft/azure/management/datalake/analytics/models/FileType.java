/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for FileType.
 */
public final class FileType {
    /** Static value Assembly for FileType. */
    public static final FileType ASSEMBLY = new FileType("Assembly");

    /** Static value Resource for FileType. */
    public static final FileType RESOURCE = new FileType("Resource");

    /** Static value Nodeploy for FileType. */
    public static final FileType NODEPLOY = new FileType("Nodeploy");

    private String value;

    /**
     * Creates a custom value for FileType.
     * @param value the custom value
     */
    public FileType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FileType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        FileType rhs = (FileType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}