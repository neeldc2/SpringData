# SpringData

Java Brains Spring Data

Dao Support class is used.
Changes:
1. NamedParameterJdbcDaoImpl class that extends NamedParameterJdbcDaoSupport 
2. added this bean to spring.xml
	<bean id="namedParameterJdbcDaoImpl" class="com.data.spring.dao.NamedParameterJdbcDaoImpl">
		<property name="dataSource" ref="dataSource"/>
	</bean>
	
Similarly, other Dao Support classes can be used.