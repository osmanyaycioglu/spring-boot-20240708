package org.training.turkcell.springboot.rest.mappings;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.training.turkcell.springboot.rest.models.PersonDto;
import org.training.turkcell.springboot.services.models.Person;

@Mapper
public interface IPersonMapping {

    IPersonMapping PERSON_MAPPING = Mappers.getMapper(IPersonMapping.class);

    Person toPerson(PersonDto personParam);
}
