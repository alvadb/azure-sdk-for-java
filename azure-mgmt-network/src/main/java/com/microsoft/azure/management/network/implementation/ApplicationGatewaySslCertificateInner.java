/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * SSL certificates of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewaySslCertificateInner extends SubResource {
    /**
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /**
     * Password for the pfx file specified in data. Only applicable in PUT
     * request.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Base-64 encoded Public cert data corresponding to pfx specified in data.
     * Only applicable in GET request.
     */
    @JsonProperty(value = "properties.publicCertData")
    private String publicCertData;

    /**
     * Provisioning state of the SSL certificate resource Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the publicCertData value.
     *
     * @return the publicCertData value
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Set the publicCertData value.
     *
     * @param publicCertData the publicCertData value to set
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewaySslCertificateInner object itself.
     */
    public ApplicationGatewaySslCertificateInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
