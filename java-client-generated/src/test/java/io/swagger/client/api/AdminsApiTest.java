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

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminsApi
 */
@Ignore
public class AdminsApiTest {

    private final AdminsApi api = new AdminsApi();

    
    /**
     * add a new pet
     *
     * Add new pet to system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws ApiException {
        String petName = null;
        Integer age = null;
        api.addPet(petName, age);

        // TODO: test validations
    }
    
}
