# AdminsApi

All URIs are relative to *https://virtserver.swaggerhub.com/gary258796/pet/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](AdminsApi.md#addPet) | **POST** /pet | add a new pet


<a name="addPet"></a>
# **addPet**
> addPet(petName, age)

add a new pet

Add new pet to system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminsApi;


AdminsApi apiInstance = new AdminsApi();
String petName = "petName_example"; // String | The name of the new pet
Integer age = 56; // Integer | The age of the new pet
try {
    apiInstance.addPet(petName, age);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#addPet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petName** | **String**| The name of the new pet |
 **age** | **Integer**| The age of the new pet |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

