package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean2 implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("\n\nInitializingBean: afterPropertiesSet called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("\n\nDisposableBean: destroy called");
    }
    @Override
    public String toString() {
        return "BeanWithInterfaces{}";
    }
}
