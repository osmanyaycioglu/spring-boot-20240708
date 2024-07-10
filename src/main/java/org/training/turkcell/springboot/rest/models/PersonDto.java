package org.training.turkcell.springboot.rest.models;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class PersonDto {
    @NotBlank
    @Size(min = 2,max = 20,message = "isim 2 ile 20 arasında olmalı")
    private String name;
    @NotEmpty
    @Size(min = 3,max = 25)
    private String surname;
    @NotNull
    @Max(300)
    @Min(50)
    private Integer height;
    @NotNull
    @Max(500)
    @Min(20)
    private Integer weight;
}
