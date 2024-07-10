package org.training.turkcell.springboot.db;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.training.turkcell.springboot.services.models.Person;

@Repository
@RequiredArgsConstructor
public class PersonDao {
    @Getter
    private final PersonRepository personRepository;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public String insert(Person personParam) {
        personRepository.save(personParam);
        insert2(personParam);
        return personParam.getPersonUUID();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert2(Person personParam) {
        personRepository.save(personParam);
    }


}
