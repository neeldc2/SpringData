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
    	
    	System.out.println("count = " + dao.getCircleCount());
    	System.out.println(dao.getCircleName(1));
    	
    	Circle circle = dao.getCircleFromId(2);
    	System.out.println(circle.getId());
    	System.out.println(circle.getName());
    	
    	dao.insertCircle(new Circle(4, "d"));
    	
    	System.out.println("count = " + dao.getAllCircle().size());
    	
    }
}
