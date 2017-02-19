package com.bellinfo.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lookup-beans.xml");
    	Car car = context.getBean("c", Car.class);
    	String engineName = car.getEngine().getEngineName();
    	System.out.println(engineName);
   	
    }
}
