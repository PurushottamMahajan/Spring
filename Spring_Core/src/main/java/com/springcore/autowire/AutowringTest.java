package com.springcore.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowringTest {

    public static void main(String[] args) {
        System.out.println("Starting Spring context...\n\n\n");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\autowire\\autowireconfig.xml");
        
        
        
        
        System.out.println("\n"+context.getBean("Mybean")+"\n\n\n");
        System.out.println("\n"+context.getBean("Mybean2")+"\n\n\n");
        System.out.println("\n"+context.getBean("Mybean3")+"\n\n\n");
        
        context.registerShutdownHook();
        

        context.close();
        System.out.println("\n\n\nSpring context closed.");
    }
}