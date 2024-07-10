package org.training.turkcell.springboot.db;

import jakarta.transaction.UserTransaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.training.turkcell.springboot.services.models.Person;

public class PersonDaoProxy extends PersonDao {
    private PersonDao personDao;

    public PersonDaoProxy(
            final PersonDao personDaoParam) {
        super(personDaoParam.getPersonRepository());
        personDao = personDaoParam;
    }

    @Override
    public String insert(Person personParam) {
//        UserTransaction userTransactionLoc = null;
//        userTransactionLoc.begin();
//        try {
//            personDao.insert(personParam);
//            userTransactionLoc.commit();
//        } catch (Exception exp) {
//            userTransactionLoc.rollback();
//        }
        return null;
    }
}
