package com.ecom.shoppingBackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.ecom.shoppingBackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
	@Value("${jdbc.url}")
	private String DATABASE_URL;
	@Value("${jdbc.driver}")
	private String DATABASE_DRIVER;
	@Value("${jdbc.dialect}")
	private String DATABASE_DIALECT;
	@Value("${jdbc.username}")
	private String DATABASE_USERNAME;
	@Value("${jdbc.password}")
	private String DATABASE_PASSWORD;

	// dataSource bean will be available
	@Bean("dataSource")
	public DataSource getDataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		
		// Providing the database connection information
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
				
		
		return dataSource;
		
	}
	
	// sessionFactory bean will be available
	
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.ecom.shoppingBackend.dto");
		
		return builder.buildSessionFactory();
		
	}

	
	
	// All the hibernate properties will be returned in this method	
	private Properties getHibernateProperties() {
		
		Properties properties = new Properties();
		
		
		properties.put("hibernate.dialect", DATABASE_DIALECT);		
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		
		//properties.put("hibernate.hbm2ddl.auto", "create");
		
		
		return properties;
	}
	
	// transactionManager bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
	
}
