package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ryz2593
 */
@RestController
@Slf4j
@RequestMapping("user")
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello() {
        log.debug("hello method is running");
        return "hello, spring boot!";
    }

    @GetMapping("{id}")
    public User queryByUserId(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}
