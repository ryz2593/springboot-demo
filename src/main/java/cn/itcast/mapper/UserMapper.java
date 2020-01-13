package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author ryz2593
 * @date 2020/1/13 16:47
 */
@Repository
public interface UserMapper extends Mapper<User> {
}
