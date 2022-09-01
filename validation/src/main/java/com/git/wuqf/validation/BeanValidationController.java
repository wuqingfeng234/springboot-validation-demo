package com.git.wuqf.validation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BeanValidationController {
    @PostMapping("/person")
    public ResponseEntity<String> savePersonInfo(@RequestBody @Valid User user) {
        return ResponseEntity.ok("create person "+ user.getName());
    }
}
