/*
 * Simple Inventory API
 * This is Gary's pet api
 *
 * OpenAPI spec version: 1.0.0
 * Contact: gary258796@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Pet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevelopersApi {
    private ApiClient apiClient;

    public DevelopersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DevelopersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for searchAllPets
     * @param petName The name of the pet you wants to search. (optional)
     * @param age The age of pet (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchAllPetsCall(String petName, Integer age, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (petName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("petName", petName));
        if (age != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("age", age));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchAllPetsValidateBeforeCall(String petName, Integer age, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchAllPetsCall(petName, age, progressListener, progressRequestListener);
        return call;

    }

    /**
     * search by name and age.
     * Return all pets with input name and age. If no input, return all pet by default. 
     * @param petName The name of the pet you wants to search. (optional)
     * @param age The age of pet (optional)
     * @return List&lt;Pet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Pet> searchAllPets(String petName, Integer age) throws ApiException {
        ApiResponse<List<Pet>> resp = searchAllPetsWithHttpInfo(petName, age);
        return resp.getData();
    }

    /**
     * search by name and age.
     * Return all pets with input name and age. If no input, return all pet by default. 
     * @param petName The name of the pet you wants to search. (optional)
     * @param age The age of pet (optional)
     * @return ApiResponse&lt;List&lt;Pet&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Pet>> searchAllPetsWithHttpInfo(String petName, Integer age) throws ApiException {
        com.squareup.okhttp.Call call = searchAllPetsValidateBeforeCall(petName, age, null, null);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * search by name and age. (asynchronously)
     * Return all pets with input name and age. If no input, return all pet by default. 
     * @param petName The name of the pet you wants to search. (optional)
     * @param age The age of pet (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAllPetsAsync(String petName, Integer age, final ApiCallback<List<Pet>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchAllPetsValidateBeforeCall(petName, age, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
