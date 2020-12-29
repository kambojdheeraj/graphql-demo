package com.example.poc.graphql.resolvers;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

/* 
 * Comparing to REST APIs, resolvers are analogous to controllers. 
 * Also Comparing to REST APIs, queries are analogous to GET requests. In schema, it works on
 * type Query.
 */

@Service
public class HelloQueryResolver implements GraphQLQueryResolver{

	public String hello() {
        return "Hello, GraphQL!";
    }
	
	 public String hello(final String who) {
	        return String.format("Hello, %s!", Optional.ofNullable(who).orElse("GraphQL"));
	  }
}