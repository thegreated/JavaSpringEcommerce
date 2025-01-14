package com.loose.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCouplingInjection.xml");

        UserManager userNewDbManager = (UserManager) context.getBean("newDbUserManager");
        UserManager userDbManager = (UserManager) context.getBean("userDbManager");
        UserManager userWebDbManager = (UserManager) context.getBean("userWebDbManager");

        System.out.println(userNewDbManager.getUserInfo());
        System.out.println(userDbManager.getUserInfo());
        System.out.println(userWebDbManager.getUserInfo());

    }
}
