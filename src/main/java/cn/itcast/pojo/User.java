package cn.itcast.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author ryz2593
 * @date 2020/1/13 15:47
 */
@Data
public class User {
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private String note;

    private Date birthday;

    private Date creteTime;

    private Date updateTime;
}
