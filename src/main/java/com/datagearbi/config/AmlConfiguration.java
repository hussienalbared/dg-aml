package com.datagearbi.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.datagearbi.model.AcAlarm;
import com.datagearbi.repository.AlaramObjectRepository;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = AlaramObjectRepository.class,
		entityManagerFactoryRef = "amlEntityManagerFactory",
		  transactionManagerRef = "amlTransactionManager"
)
public class AmlConfiguration {

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSourceProperties amlDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSource amlDataSource() {
		return amlDataSourceProperties().initializeDataSourceBuilder().build();
		// return DataSourceBuilder.create().build();

	}

	@Primary
	@Bean(name = "amlEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean amlEntityManagerFactory(EntityManagerFactoryBuilder builder) {
		return builder.dataSource(amlDataSource())
				.packages(AcAlarm.class)
				.persistenceUnit("aml")
				.build();
	}

	@Primary
	@Bean(name = "amlTransactionManager")
	public PlatformTransactionManager amlTransactionManager(
			@Qualifier("amlEntityManagerFactory") EntityManagerFactory amlEntityManagerFactory) {
		return new JpaTransactionManager(amlEntityManagerFactory);
	}

}
