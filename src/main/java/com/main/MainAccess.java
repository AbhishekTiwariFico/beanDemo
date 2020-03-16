package com.main;

import com.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAccess {

    public static void main(String[] args)
    {
//
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e = (Employee) applicationContext.getBean("e");
        e.show();

    }
}
