# SpringData

Java Brains Spring Data

Connection Driver class, URL, username and password is stored in spring.xml.
These values are initialised as properties in org.springframework.jdbc.datasource.DriverManagerDataSource class bean.

In JdbcDaoImpl class, these lines are included
1. @Autowired
	private DataSource dataSource;

import required for DataSource is import javax.sql.DataSource;	
	
2. dataSource.getConnection() statement gives connection object