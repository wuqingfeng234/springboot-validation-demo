package com.git.wuqf.validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotBlank(message = "name is mandatory")
    private String name;

    @Min(value = 0,message = "min age is 0")
    private Integer age;
}
