package com.git.wuqf.validation;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@Validated
@RestController
public class RequestParamsValidationController {
    @GetMapping("/user")
    public User getUser(@RequestParam @NotBlank String name) {
        return new User(name, 19);
    }
}
