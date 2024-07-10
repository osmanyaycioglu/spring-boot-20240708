package org.training.turkcell.springboot.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.training.turkcell.springboot.services.models.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
