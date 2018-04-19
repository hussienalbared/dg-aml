package com.datagearbi.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.datagearbi.model.security.User;
import com.datagearbi.security.repository.UserRepository;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = UserRepository.class,
		entityManagerFactoryRef = "adminEntityManagerFactory",
		transactionManagerRef = "adminTransactionManager"
)
public class AdminConfiguration {

	@Bean
	@ConfigurationProperties("spring.datasource.second")
	public DataSourceProperties adminDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.second")
	public DataSource adminDataSource() {
		return adminDataSourceProperties().initializeDataSourceBuilder().build();
		// return DataSourceBuilder.create().build();

	}
	
	@Bean(name = "adminEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean adminEntityManagerFactory(EntityManagerFactoryBuilder builder) {
		return builder.dataSource(adminDataSource())
				.packages(User.class)
				.persistenceUnit("admin")
				.build();
	}

	@Bean(name = "adminTransactionManager")
	public PlatformTransactionManager adminTransactionManager(
			@Qualifier("adminEntityManagerFactory") EntityManagerFactory adminEntityManagerFactory) {
		return new JpaTransactionManager(adminEntityManagerFactory);
	}
}
