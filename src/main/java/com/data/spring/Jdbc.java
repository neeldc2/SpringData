package com.data.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.data.spring.dao.JdbcDaoImpl;
import com.data.spring.model.Circle;

public class Jdbc 
{
    public static void main( String[] args ) {
    	
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	JdbcDaoImpl dao = context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
    	
    	Circle circle = dao.getCircle(1);
    	System.out.println(circle.getName());
    	
    	context.close();
    	
    }
}
