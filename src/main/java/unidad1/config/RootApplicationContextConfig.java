package unidad1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan("unidad1")
@EnableJpaRepositories
public class RootApplicationContextConfig {
	
	@Bean
	public DataSource dataSource() {
	EmbeddedDatabaseBuilder builder = new
	EmbeddedDatabaseBuilder();
	EmbeddedDatabase db = builder
	.setType(EmbeddedDatabaseType.HSQL)
	.addScript("db/sql/create-table.sql")
	.addScript("db/sql/insert-data.sql")
	.build();
	return db;
	}
	
	@Bean
	public NamedParameterJdbcTemplate getJdbcTemplate() {
	return new NamedParameterJdbcTemplate(dataSource());
	}
    @Bean
    public PlatformTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
}
