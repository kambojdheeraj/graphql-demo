package com.example.poc.graphql.resolvers;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.poc.graphql.model.Person;

/*
 * For the use case, where the fieldname doesn't exit in DB
 * Like
 * type Person {
     id: Int!
     firstName: String!
     lastName: String!
     fullName: String!
 }
  fullName - we don't have field in DB so we ma need to resolve that field and GraphQLResolver
  interface helps there.
 */

@Service
public class PersonResolver implements GraphQLResolver<Person> {
 
	
   public String fullName(final Person person) {
       return person.getFirstName() + " " + person.getLastName();
   }
}
