package cn.itcast.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ryz2593
 * @date 2020/1/13 14:37
 */
//@ConfigurationProperties(prefix = "jdbc")
//@Data
//方式2
//直接加component注解或者在 JdbcConfig类上加@EnableConfigurationProperties注解
//@Component
//public class JdbcProperties {
//    String url;
//    String driverClassName;
//    String username;
//    String password;
//    //yaml 可以注入对象属性
//    User user = new User();
//
//    class User{
//        String name;
//        int age;
//        List<String> language;
//    }
//}
