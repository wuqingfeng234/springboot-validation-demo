package com.git.wuqf.validation;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@ToString
public class User {
    @Min(value = 0,message = "min age is 0")
    private Integer age;
    @NotBlank(message = "name is mandatory")
    private String name;
}
