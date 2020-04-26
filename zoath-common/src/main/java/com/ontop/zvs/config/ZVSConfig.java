package com.ontop.zoath.config;

import com.ontop.zoath.core.MyBatisConfig;
import com.ontop.zoath.dao.zoathDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Description: 描述：
 * @Author: 作者：ttsf
 * @Date: 日期：2019/11/25 9:49
 * @updata: 更新：
 * @Param: 参数： * @param null :
 * @return: 返回值：
 */
@Configuration
@ConfigurationProperties(prefix = "jdbc.zoath")
@MapperScan(basePackages = "com.ontop.zoath", markerInterface = zoathDao.class, sqlSessionFactoryRef = "zoathSqlSessionFactory")
public class zoathConfig extends MyBatisConfig {
    @Override
    @Bean(name = "zoathDataSource")
    @Primary
    public DataSource getDataSource() throws Exception {
        return super.getDataSource();
    }

    @Override
    @Bean(name = "zoathSqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("zoathDataSource") DataSource dataSource) throws Exception {
        return super.sqlSessionFactory(dataSource);
    }
}