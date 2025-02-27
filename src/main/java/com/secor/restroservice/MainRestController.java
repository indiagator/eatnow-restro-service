package com.secor.restroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MainRestController {

    @Autowired
    RestroRepository restroRepository;

    @PostMapping("create/restro")
    public ResponseEntity<?> createRestro(@RequestBody Restro restro)
    {


        return ResponseEntity.ok("Restro created successfully");
    }

}
