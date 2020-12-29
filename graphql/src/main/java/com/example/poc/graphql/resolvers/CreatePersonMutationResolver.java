package com.example.poc.graphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.poc.graphql.model.Person;
import com.example.poc.graphql.service.PersonService;

/*
 * Mutations like DML – Create, Update, Delete
 * or in REST API analogous to POST, PUT, DELETE
 */

@Service
public class CreatePersonMutationResolver implements GraphQLMutationResolver {
 
   @Autowired	
   private final PersonService personService;
 
   public CreatePersonMutationResolver(final PersonService personService) {
       this.personService = personService;
   }
    
   public Person createPerson(final String firstName, final String lastName) {
       return personService.createPerson(firstName, lastName);
   }
}