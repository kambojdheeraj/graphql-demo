package com.example.poc.graphql.resolvers;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.poc.graphql.model.Person;
import com.example.poc.graphql.service.PersonService;

@Service
public class PersonQueryResolver implements GraphQLQueryResolver {
    
    private final PersonService personService;
 
    public PersonQueryResolver(final PersonService personService) {
        this.personService = personService;
    }
 
    public Collection<Person> people() {
        return personService.getPeople();
    }
}
