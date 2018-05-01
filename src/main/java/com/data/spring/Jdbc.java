package com.data.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.data.spring.dao.NamedParameterJdbcDaoImpl;

public class Jdbc 
{
    public static void main( String[] args ) {
    	
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	NamedParameterJdbcDaoImpl dao = context.getBean("namedParameterJdbcDaoImpl", NamedParameterJdbcDaoImpl.class);
    	System.out.println(dao.getCircleCount());
    	
    }
}
