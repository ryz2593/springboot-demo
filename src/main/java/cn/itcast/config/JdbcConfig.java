package cn.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author ryz2593
 * 方式1
 * @PropertySource("classpath:jdbc.properties")
 * f方式2
 * @EnableConfigurationProperties(JdbcProperties.class)
 */
//@Configuration
//
////
//public class JdbcConfig {

    /**
     * 方式1
     *
     * @Value("${jdbc.driverClassName}")
     * private String driverClassName;
     * @Value("${jdbc.url}")
     * private String url;
     * @Value("${jdbc.username}")
     * private String username;
     * @Value("${jdbc.password}")
     * private String password;
     *
     * @Bean
     * public DataSource dataSource() {
     *    DruidDataSource dataSource = new DruidDataSource();
     *    dataSource.setDriverClassName(driverClassName);
     *    dataSource.setUrl(url);
     *    dataSource.setUsername(username);
     *    dataSource.setPassword(password);
     *    return dataSource;
     * }
     */

    /**
     * 方式二
     * 这种方式还是比较灵活
     * @param prop
     * @return
     */
//    @Bean
//    public DataSource dataSource(JdbcProperties prop) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(prop.getDriverClassName());
//        dataSource.setUrl(prop.getUrl());
//        dataSource.setUsername(prop.getUsername());
//        dataSource.setPassword(prop.getPassword());
//        return dataSource;
//    }

    /**
     * 第三种方式
     */
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSource() {
//        return new DruidDataSource();
//
//    }
//
//}
