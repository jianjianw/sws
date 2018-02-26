package com.nhsoft.sws.provider;

import com.alibaba.druid.pool.DruidDataSource;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;



@Configuration
@ImportResource({"classpath:config.xml"})
@PropertySource({"classpath:jdbc.properties"})
public class DataSourceConfig implements EnvironmentAware {

	private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
	
	private Map hibernateProperties = new HashMap();

	@Value("${jdbc.driver}")
	private String DB_DRIVER;

	@Value("${jdbc.password}")
	private String DB_PASSWORD;

	@Value("${jdbc.url}")
	private String DB_URL;

	@Value("${jdbc.username}")
	private String DB_USERNAME;

	

	@Bean
	public RestTemplate restTemplate() {
		HttpComponentsClientHttpRequestFactory factory =  new HttpComponentsClientHttpRequestFactory();
		factory.setConnectTimeout(3000);
		factory.setReadTimeout(10000);
		RestTemplate restTemplate = new RestTemplate(factory);
		return restTemplate;
	}
	
	@Override
	public void setEnvironment(Environment environment) {
		RelaxedPropertyResolver propertyResolver = new RelaxedPropertyResolver(environment, "hibernate.");
		hibernateProperties = propertyResolver.getSubProperties("");
		
	}


	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean sessionFactory(){

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(buildDruidDataSource());
		sessionFactory.getHibernateProperties().putAll(hibernateProperties);
		sessionFactory.setPackagesToScan("com.nhsoft.module.sws.export.model");
		//sessionFactory.setPhysicalNamingStrategy(new SpringPhysicalNamingStrategy());

		sessionFactory.setPhysicalNamingStrategy(new PhysicalNamingStrategyStandardImpl());

		return sessionFactory;
	}

	public DruidDataSource buildDruidDataSource() {

		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl(DB_URL);
		druidDataSource.setDriverClassName(DB_DRIVER);
		druidDataSource.setUsername(DB_USERNAME);
		druidDataSource.setPassword(DB_PASSWORD);
		druidDataSource.setInitialSize(10);
		druidDataSource.setMinIdle(10);
		druidDataSource.setMaxActive(1000);
		druidDataSource.setTimeBetweenEvictionRunsMillis(600000);
		druidDataSource.setMinEvictableIdleTimeMillis(600000);
		druidDataSource.setValidationQuery("SELECT 'x'");
		druidDataSource.setPoolPreparedStatements(true);
		druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
		druidDataSource.setTestOnBorrow(false);
		druidDataSource.setTestOnReturn(false);
		druidDataSource.setTestWhileIdle(true);
		druidDataSource.setRemoveAbandoned(true);
		druidDataSource.setRemoveAbandonedTimeout(3600);
		return druidDataSource;
	}
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager =
				new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}


}
