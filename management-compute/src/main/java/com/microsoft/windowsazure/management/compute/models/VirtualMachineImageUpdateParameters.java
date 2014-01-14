/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import java.net.URI;
import java.util.Calendar;

/**
* Parameters supplied to the Update Virtual Machine Image operation.
*/
public class VirtualMachineImageUpdateParameters
{
    private String description;
    
    /**
    * Optional. Specifies the description of the OS image.
    */
    public String getDescription() { return this.description; }
    
    /**
    * Optional. Specifies the description of the OS image.
    */
    public void setDescription(String description) { this.description = description; }
    
    private String eula;
    
    /**
    * Optional. Specifies the End User License Agreement that is associated
    * with the image. The value for this element is a string, but it is
    * recommended that the value be a URL that points to a EULA.
    */
    public String getEula() { return this.eula; }
    
    /**
    * Optional. Specifies the End User License Agreement that is associated
    * with the image. The value for this element is a string, but it is
    * recommended that the value be a URL that points to a EULA.
    */
    public void setEula(String eula) { this.eula = eula; }
    
    private URI iconUri;
    
    /**
    * Optional. Specifies the Uri to the icon that is displayed for the image
    * in the Management Portal.
    */
    public URI getIconUri() { return this.iconUri; }
    
    /**
    * Optional. Specifies the Uri to the icon that is displayed for the image
    * in the Management Portal.
    */
    public void setIconUri(URI iconUri) { this.iconUri = iconUri; }
    
    private String imageFamily;
    
    /**
    * Optional. Specifies a value that can be used to group OS images.
    */
    public String getImageFamily() { return this.imageFamily; }
    
    /**
    * Optional. Specifies a value that can be used to group OS images.
    */
    public void setImageFamily(String imageFamily) { this.imageFamily = imageFamily; }
    
    private boolean isPremium;
    
    /**
    * Indicates if the image contains software or associated services that will
    * incur charges above the core price for the virtual machine.
    */
    public boolean getIsPremium() { return this.isPremium; }
    
    /**
    * Indicates if the image contains software or associated services that will
    * incur charges above the core price for the virtual machine.
    */
    public void setIsPremium(boolean isPremium) { this.isPremium = isPremium; }
    
    private String label;
    
    /**
    * Required. Specifies the friendly name of the image to be updated. You
    * cannot use this operation to update images provided by the Windows Azure
    * platform.
    */
    public String getLabel() { return this.label; }
    
    /**
    * Required. Specifies the friendly name of the image to be updated. You
    * cannot use this operation to update images provided by the Windows Azure
    * platform.
    */
    public void setLabel(String label) { this.label = label; }
    
    private String language;
    
    /**
    * Specifies the language of the image.  The Language element is only
    * available using version 2013-03-01 or higher.
    */
    public String getLanguage() { return this.language; }
    
    /**
    * Specifies the language of the image.  The Language element is only
    * available using version 2013-03-01 or higher.
    */
    public void setLanguage(String language) { this.language = language; }
    
    private URI privacyUri;
    
    /**
    * Optional. Specifies the URI that points to a document that contains the
    * privacy policy related to the OS image.
    */
    public URI getPrivacyUri() { return this.privacyUri; }
    
    /**
    * Optional. Specifies the URI that points to a document that contains the
    * privacy policy related to the OS image.
    */
    public void setPrivacyUri(URI privacyUri) { this.privacyUri = privacyUri; }
    
    private Calendar publishedDate;
    
    /**
    * Optional. Specifies the date when the OS image was added to the image
    * repository.
    */
    public Calendar getPublishedDate() { return this.publishedDate; }
    
    /**
    * Optional. Specifies the date when the OS image was added to the image
    * repository.
    */
    public void setPublishedDate(Calendar publishedDate) { this.publishedDate = publishedDate; }
    
    private VirtualMachineRoleSize recommendedVMSize;
    
    /**
    * Optional. Specifies the size to use for the virtual machine that is
    * created from the OS image.
    */
    public VirtualMachineRoleSize getRecommendedVMSize() { return this.recommendedVMSize; }
    
    /**
    * Optional. Specifies the size to use for the virtual machine that is
    * created from the OS image.
    */
    public void setRecommendedVMSize(VirtualMachineRoleSize recommendedVMSize) { this.recommendedVMSize = recommendedVMSize; }
    
    private URI smallIconUri;
    
    /**
    * Specifies the URI to the small icon that is displayed when the image is
    * presented in the Windows Azure Management Portal.  The SmallIconUri
    * element is only available using version 2013-03-01 or higher.
    */
    public URI getSmallIconUri() { return this.smallIconUri; }
    
    /**
    * Specifies the URI to the small icon that is displayed when the image is
    * presented in the Windows Azure Management Portal.  The SmallIconUri
    * element is only available using version 2013-03-01 or higher.
    */
    public void setSmallIconUri(URI smallIconUri) { this.smallIconUri = smallIconUri; }
    
    /**
    * Initializes a new instance of the VirtualMachineImageUpdateParameters
    * class.
    *
    */
    public VirtualMachineImageUpdateParameters()
    {
    }
}