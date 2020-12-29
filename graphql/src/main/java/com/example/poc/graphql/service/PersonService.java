package com.example.poc.graphql.service;

import org.springframework.stereotype.Service;

import com.example.poc.graphql.model.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Business Layer
 */
@Service
public class PersonService {

	private static int INDEX_COUNTER = 0;
	private final Collection<Person> people = new ConcurrentLinkedQueue<>();

	public PersonService() {
	}

	public Person createPerson(final String firstName, final String lastName) {
		final Person person = new Person(++INDEX_COUNTER, firstName, lastName);
		people.add(person);
		return person;
	}

	public Collection<Person> getPeople() {
		return Collections.unmodifiableCollection(people);
	}

}
