package com.company.business.apitwo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {


    @RequestMapping(path="/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Address> getAddress(
            @PathVariable(name = "id") String id) {

        Address a = new Address();
        a.setStreet("1234 Main Street");
        a.setCity("Denver");
        a.setState("CO");
        a.setZip("80003");

        return ResponseEntity.ok(a);
    }
}
