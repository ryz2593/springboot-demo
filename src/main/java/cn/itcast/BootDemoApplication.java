package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ryz2593
 */
@SpringBootApplication
public class BootDemoApplication {
    public static void main(String[] args) {
        //args是main函数的参数，当在命令行启动时会用到
        SpringApplication.run(BootDemoApplication.class, args);
    }
}
