package com.springcore.autowire.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAutowiring {
    public static void main(String[] args) {
        System.out.println("Starting Spring context...\n\n\n");
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("com\\springcore\\autowire\\annotations\\autowireannotationconfig.xml");
        MyBean1 myBean = context.getBean("myBean1", MyBean1.class);
        System.out.println("\n" + myBean + "\n\n\n");
        context.registerShutdownHook();
        context.close();
        System.out.println("\n\n\nSpring context closed.");
    }
}
