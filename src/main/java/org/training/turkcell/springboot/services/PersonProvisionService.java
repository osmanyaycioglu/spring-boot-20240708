package org.training.turkcell.springboot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.training.turkcell.springboot.db.PersonDao;
import org.training.turkcell.springboot.services.models.Person;

@Service
@RequiredArgsConstructor
public class PersonProvisionService {
    private final PersonDao personDao;

    public String add(Person personParam){
        return personDao.insert(personParam);
    }

}
