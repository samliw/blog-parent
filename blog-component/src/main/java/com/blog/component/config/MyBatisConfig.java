package com.blog.component.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * mapper核心类，勿动.
 * Created by luck on 2017/09/28.
 */
@EnableTransactionManagement
@Configuration
public class MyBatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            // 基于注解扫描Mapper，不需配置xml路径 如果需要自定义xml就需要配置
            bean.setMapperLocations(resolver.getResources("classpath:mybatis/*/*.xml"));
           // bean.setConfigLocation(resolver.getResource("classpath:/configLocation/mybatis-config.xml"));
            bean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 配置事务管理器
     */
    @Bean
    @Primary
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
