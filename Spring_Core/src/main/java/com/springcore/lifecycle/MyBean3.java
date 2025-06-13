package com.springcore.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean3 {

    @PostConstruct
    public void init() {
        System.out.println("\n\n@PostConstruct init method called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("\n\n@PreDestroy cleanup method called");
    }
    @Override
    public String toString() {
        return "BeanWithAnnotations{}";
    }
}
