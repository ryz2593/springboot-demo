package cn.itcast;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ryz2593
 */
@SpringBootApplication
//mapper文件扫描，要使用通用mapper的MapperScan注解
@MapperScan("cn.itcast.mapper")
public class BootDemoApplication {
    public static void main(String[] args) {
        //args是main函数的参数，当在命令行启动时会用到
        SpringApplication.run(BootDemoApplication.class, args);
    }
}
