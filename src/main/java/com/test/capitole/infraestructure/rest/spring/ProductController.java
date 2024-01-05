package com.test.capitole.infraestructure.rest.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductControllerBase {

    @GetMapping(value= "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("WORKING");
    }
}
