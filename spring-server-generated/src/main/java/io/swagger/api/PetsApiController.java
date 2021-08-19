package io.swagger.api;

import io.swagger.model.Pet;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-18T16:39:44.865Z")

@Controller
public class PetsApiController implements PetsApi {

    private static final Logger log = LoggerFactory.getLogger(PetsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public ResponseEntity<List<Pet>> searchAllPets(@ApiParam(value = "The name of the pet you wants to search.") @Valid @RequestParam(value = "petName", required = false) String petName,
                                                   @Min(0) @Max(30) @ApiParam(value = "The age of pet") @Valid @RequestParam(value = "age", required = false) Integer age) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            List<Pet> pets = Stream.of(
                    new Pet("Max", 5),
                    new Pet("Love", 7),
                    new Pet("Tanya", 10)
            ).collect(Collectors.toList());

            List<Pet> filteredPet = pets;
            if(!StringUtils.isEmpty(petName)) {
                filteredPet = pets.stream().filter(pet -> {
                    return pet.getName().equals(petName);
                }).collect(Collectors.toList());
            }
            if(age != null) {
                filteredPet = pets.stream().filter(pet -> {
                    return pet.getAge().equals(age);
                }).collect(Collectors.toList());
            }

            return new ResponseEntity<List<Pet>>(filteredPet, HttpStatus.OK);
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
