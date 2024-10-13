package net.examples.vaj;


import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldResolver {

    @QueryMapping
    public String hello() {
        return "Hello, GraphQL with Spring Boot and Java 20!";
    }
}

