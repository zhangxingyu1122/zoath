package com.ontop.zoath.core;


import com.github.pagehelper.PageInterceptor;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyBatisConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisConfig.class);
    private String url;
    private String username;
    private String password;
    private boolean readOnly = false;
    private int connTimeout = 15000;
    private int idleTimeout = 600000;
    private int maxLifetime = 1800000;
    private int maxPoolSize = 20;
    private int minimumIdle = 4;


    protected DataSource getDataSource() throws Exception {
        LOGGER.info("url===================================="+url);
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.jdbc.Driver");
        config.setConnectionInitSql("select 1");
        config.setJdbcUrl(this.url);
        config.setUsername(this.username);
        config.setPassword(this.password);
        config.setReadOnly(this.readOnly);
        config.setConnectionTimeout((long) this.connTimeout);
        config.setIdleTimeout((long) this.idleTimeout);
        config.setMaxLifetime((long) this.maxLifetime);
        config.setMaximumPoolSize(this.maxPoolSize);
        config.setMinimumIdle(this.minimumIdle);
        return new HikariDataSource(config);
    }

    protected SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(dataSource);
        fb.setPlugins(new Interceptor[]{this.pageHelper()});
        return fb.getObject();
    }

    @Bean
    public PageInterceptor pageHelper() {
        LOGGER.info("注册MyBatis分页插件PageHelper");
        PageInterceptor pageHelper = new PageInterceptor();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
