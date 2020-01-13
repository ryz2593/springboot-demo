package cn.itcast.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author ryz2593
 */
@RestController
@Slf4j
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @GetMapping("hello")
    public String hello() {
        log.debug("hello method is running");
        return "hello, spring boot!";
    }
}
