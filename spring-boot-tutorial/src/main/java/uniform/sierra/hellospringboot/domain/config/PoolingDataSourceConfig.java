package uniform.sierra.hellospringboot.domain.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoolingDataSourceConfig {
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("TECadmin");
        dataSource.setUrl("jdbc:mysql://172.17.0.2:3306/hello_application?useSSL=false");
        dataSource.setDefaultAutoCommit(false);
        dataSource.setMaxTotal(96);
        dataSource.setMaxIdle(16);
        dataSource.setMinIdle(0);
        dataSource.setMaxWaitMillis(60000);

        return dataSource;
    }
}
