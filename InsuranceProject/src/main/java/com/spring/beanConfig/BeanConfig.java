package com.spring.beanConfig;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class BeanConfig {

	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("INSERT PACKAGE NAME HERE");
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	private DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassLoader("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;
	}

	private Properties hibernateProperties() {
		return new Properties() {
			setProperty("hibernate.hbm2ddl.auto", "update");
			setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
			setProperty("hibernate.show_sql", "true");
		}
	}

}
