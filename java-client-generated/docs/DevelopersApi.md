# DevelopersApi

All URIs are relative to *https://virtserver.swaggerhub.com/gary258796/pet/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchAllPets**](DevelopersApi.md#searchAllPets) | **GET** /pets | search by name and age.


<a name="searchAllPets"></a>
# **searchAllPets**
> List&lt;Pet&gt; searchAllPets(petName, age)

search by name and age.

Return all pets with input name and age. If no input, return all pet by default. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String petName = "petName_example"; // String | The name of the pet you wants to search.
Integer age = 56; // Integer | The age of pet
try {
    List<Pet> result = apiInstance.searchAllPets(petName, age);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#searchAllPets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petName** | **String**| The name of the pet you wants to search. | [optional]
 **age** | **Integer**| The age of pet | [optional]

### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

