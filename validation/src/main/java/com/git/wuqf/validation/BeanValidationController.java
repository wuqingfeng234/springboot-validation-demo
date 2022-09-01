package com.git.wuqf.validation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BeanValidationController {
    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody @Valid User user) {
        return ResponseEntity.ok("create user "+ user.getName());
    }
}
