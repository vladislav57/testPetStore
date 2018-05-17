package su.msk.jet.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class SpringRootConfig {
/*
    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.DERBY)
                .addScript("sql/create-jpa.sql")
                .addScript("sql/insert-data.sql")
                .build();
        return db;
    }*/
}
