package org.training.turkcell.springboot.rest;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.training.turkcell.springboot.rest.models.PersonDto;

public interface IPersonProvisionController {

    @PostMapping("/add")
    @Operation(description = "Yeni kullanıcıyı sistme ekleme",summary = "ekleme işlemi")
    String add(@RequestBody PersonDto personDtoParam);

    @GetMapping("/suspend")
    String suspend(@RequestParam Long personId);

    @GetMapping("/activate")
    String activate(@RequestParam Long personId);
}
