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

package com.microsoft.azure.management.storage;

import com.microsoft.azure.management.storage.models.CheckNameAvailabilityResponse;
import com.microsoft.azure.management.storage.models.KeyName;
import com.microsoft.azure.management.storage.models.StorageAccountCreateParameters;
import com.microsoft.azure.management.storage.models.StorageAccountCreateResponse;
import com.microsoft.azure.management.storage.models.StorageAccountGetPropertiesResponse;
import com.microsoft.azure.management.storage.models.StorageAccountListKeysResponse;
import com.microsoft.azure.management.storage.models.StorageAccountListResponse;
import com.microsoft.azure.management.storage.models.StorageAccountRegenerateKeyResponse;
import com.microsoft.azure.management.storage.models.StorageAccountUpdateParameters;
import com.microsoft.azure.management.storage.models.StorageAccountUpdateResponse;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* Operations for managing storage accounts.
*/
public interface StorageAccountOperations {
    /**
    * Asynchronously creates a new storage account with the specified
    * parameters. Existing accounts cannot be updated with this API and should
    * instead use the Update Storage Account API. If an account is already
    * created and subsequent PUT request is issued with exact same set of
    * properties, then HTTP 200 would be returned.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param parameters Required. The parameters to provide for the created
    * account.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Create storage account operation response.
    */
    StorageAccountCreateResponse beginCreate(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Asynchronously creates a new storage account with the specified
    * parameters. Existing accounts cannot be updated with this API and should
    * instead use the Update Storage Account API. If an account is already
    * created and subsequent PUT request is issued with exact same set of
    * properties, then HTTP 200 would be returned.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param parameters Required. The parameters to provide for the created
    * account.
    * @return The Create storage account operation response.
    */
    Future<StorageAccountCreateResponse> beginCreateAsync(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters);
    
    /**
    * Checks that account name is valid and is not in use.
    *
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The CheckNameAvailability operation response.
    */
    CheckNameAvailabilityResponse checkNameAvailability(String accountName) throws IOException, ServiceException;
    
    /**
    * Checks that account name is valid and is not in use.
    *
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @return The CheckNameAvailability operation response.
    */
    Future<CheckNameAvailabilityResponse> checkNameAvailabilityAsync(String accountName);
    
    /**
    * Asynchronously creates a new storage account with the specified
    * parameters. Existing accounts cannot be updated with this API and should
    * instead use the Update Storage Account API. If an account is already
    * created and subsequent create request is issued with exact same set of
    * properties, the request succeeds.The max number of storage accounts that
    * can be created per subscription is limited to 20.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param parameters Required. The parameters to provide for the created
    * account.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The Create storage account operation response.
    */
    StorageAccountCreateResponse create(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * Asynchronously creates a new storage account with the specified
    * parameters. Existing accounts cannot be updated with this API and should
    * instead use the Update Storage Account API. If an account is already
    * created and subsequent create request is issued with exact same set of
    * properties, the request succeeds.The max number of storage accounts that
    * can be created per subscription is limited to 20.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param parameters Required. The parameters to provide for the created
    * account.
    * @return The Create storage account operation response.
    */
    Future<StorageAccountCreateResponse> createAsync(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters);
    
    /**
    * Deletes a storage account in Microsoft Azure.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String resourceGroupName, String accountName) throws IOException, ServiceException;
    
    /**
    * Deletes a storage account in Microsoft Azure.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String resourceGroupName, String accountName);
    
    /**
    * Returns the properties for the specified storage account including but
    * not limited to name, account type, location, and account status. The
    * ListKeys operation should be used to retrieve storage keys.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Get storage account operation response.
    */
    StorageAccountGetPropertiesResponse getProperties(String resourceGroupName, String accountName) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Returns the properties for the specified storage account including but
    * not limited to name, account type, location, and account status. The
    * ListKeys operation should be used to retrieve storage keys.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @return The Get storage account operation response.
    */
    Future<StorageAccountGetPropertiesResponse> getPropertiesAsync(String resourceGroupName, String accountName);
    
    /**
    * Lists all the storage accounts available under the subscription. Note
    * that storage keys are not returned; use the ListKeys operation for this.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The list storage accounts operation response.
    */
    StorageAccountListResponse list() throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Lists all the storage accounts available under the subscription. Note
    * that storage keys are not returned; use the ListKeys operation for this.
    *
    * @return The list storage accounts operation response.
    */
    Future<StorageAccountListResponse> listAsync();
    
    /**
    * Lists all the storage accounts available under the given resource group.
    * Note that storage keys are not returned; use the ListKeys operation for
    * this.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The list storage accounts operation response.
    */
    StorageAccountListResponse listByResourceGroup(String resourceGroupName) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Lists all the storage accounts available under the given resource group.
    * Note that storage keys are not returned; use the ListKeys operation for
    * this.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @return The list storage accounts operation response.
    */
    Future<StorageAccountListResponse> listByResourceGroupAsync(String resourceGroupName);
    
    /**
    * Lists the access keys for the specified storage account.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param accountName Required. The name of the storage account.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The ListKeys operation response.
    */
    StorageAccountListKeysResponse listKeys(String resourceGroupName, String accountName) throws IOException, ServiceException;
    
    /**
    * Lists the access keys for the specified storage account.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param accountName Required. The name of the storage account.
    * @return The ListKeys operation response.
    */
    Future<StorageAccountListKeysResponse> listKeysAsync(String resourceGroupName, String accountName);
    
    /**
    * Regenerates the access keys for the specified storage account.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param regenerateKey Required. Specifies name of the key which should be
    * regenerated.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The RegenerateKey operation response.
    */
    StorageAccountRegenerateKeyResponse regenerateKey(String resourceGroupName, String accountName, KeyName regenerateKey) throws IOException, ServiceException;
    
    /**
    * Regenerates the access keys for the specified storage account.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param regenerateKey Required. Specifies name of the key which should be
    * regenerated.
    * @return The RegenerateKey operation response.
    */
    Future<StorageAccountRegenerateKeyResponse> regenerateKeyAsync(String resourceGroupName, String accountName, KeyName regenerateKey);
    
    /**
    * Updates the account type or tags for a storage account. It can also be
    * used to add a custom domain (note that custom domains cannot be added
    * via the Create operation). Only one custom domain is supported per
    * storage account. This API can only be used to update one of tags,
    * accountType, or customDomain per call. To update multiple of these
    * properties, call the API multiple times with one change per call. This
    * call does not change the storage keys for the account. If you want to
    * change storage account keys, use the RegenerateKey operation. The
    * location and name of the storage account cannot be changed after
    * creation.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param parameters Required. The parameters to update on the account. Note
    * that only one property can be changed at a time using this API.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Update storage account operation response.
    */
    StorageAccountUpdateResponse update(String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Updates the account type or tags for a storage account. It can also be
    * used to add a custom domain (note that custom domains cannot be added
    * via the Create operation). Only one custom domain is supported per
    * storage account. This API can only be used to update one of tags,
    * accountType, or customDomain per call. To update multiple of these
    * properties, call the API multiple times with one change per call. This
    * call does not change the storage keys for the account. If you want to
    * change storage account keys, use the RegenerateKey operation. The
    * location and name of the storage account cannot be changed after
    * creation.
    *
    * @param resourceGroupName Required. The name of the resource group within
    * the user’s subscription.
    * @param accountName Required. The name of the storage account within the
    * specified resource group. Storage account names must be between 3 and 24
    * characters in length and use numbers and lower-case letters only.
    * @param parameters Required. The parameters to update on the account. Note
    * that only one property can be changed at a time using this API.
    * @return The Update storage account operation response.
    */
    Future<StorageAccountUpdateResponse> updateAsync(String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters);
}