package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

    public static void main(String[] args) {
        System.out.println("Starting Spring context...\n\n\n");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\lifecycle\\lyfcycleconfig.xml");
        
        
        
        
        System.out.println("\n"+context.getBean("beanWithXmlConfig")+"\n\n\n");
        System.out.println(context.getBean("beanWithInterfaces")+"\n\n\n");
        System.out.println(context.getBean("beanWithAnnotations")+"\n\n\n");
        context.registerShutdownHook();
        

        context.close();
        System.out.println("\n\n\nSpring context closed.");
    }
}