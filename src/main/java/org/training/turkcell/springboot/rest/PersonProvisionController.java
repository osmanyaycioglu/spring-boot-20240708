package org.training.turkcell.springboot.rest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.training.turkcell.springboot.rest.mappings.IPersonMapping;
import org.training.turkcell.springboot.rest.models.PersonDto;
import org.training.turkcell.springboot.services.PersonProvisionService;

@RestController
@RequestMapping("/api/v1/person/provision")
@RequiredArgsConstructor
public class PersonProvisionController implements IPersonProvisionController {
    private final PersonProvisionService personProvisionService;

    public String add(@RequestBody @Valid PersonDto personDtoParam) {
        String uuid = personProvisionService.add(IPersonMapping.PERSON_MAPPING.toPerson(personDtoParam));
        return uuid;
    }

    public String suspend(@RequestParam Long personId) {
        return "OK";
    }

    public String activate(@RequestParam Long personId) {
        return "OK";
    }

}
