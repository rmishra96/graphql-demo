package com.spring.graphqldemo;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class GraphqlController {

    @QueryMapping()
    public Mono<String> sayHello(){
        return Mono.just("Hello World");
    }
}
