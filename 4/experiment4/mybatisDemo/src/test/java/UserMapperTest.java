import com.haust.mapper.UserMapper;
import com.haust.pojo.Order2;
import com.haust.pojo.OrderUser;
import com.haust.pojo.User;
import com.haust.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void testQueryOrderUser(){
        // mybatis和spring整合，整合之后，交给spring管理
        SqlSession sqlSession = MybatisUtil.getSession();
        // 创建Mapper接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 使用 userMapper 执行根据条件查询用户
        List<OrderUser> list = userMapper.queryOrderUser();
        for (OrderUser ou : list) {
            System.out.println(ou);
        }
        // mybatis 和 spring 整合，整合之后，交给spring管理
        sqlSession.close();
    }
    @Test
    public void testQueryOrderUserResultMap() {
        // mybatis 和 spring 整合，整合之后，交给spring管理
        SqlSession sqlSession = MybatisUtil.getSession();
        // 创建 Mapper 接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 使用 userMapper 执行根据条件查询用户
        List<Order2> list = userMapper.queryOrderUserResultMap();
        for (Order2 o : list) {
            System.out.println(o);
        }
        // mybatis 和 spring 整合，整合之后，交给spring管理
        sqlSession.close();
    }
    @Test
    public void testQueryUserOrder() {
        // mybatis 和 spring 整合，整合之后，交给spring管理
        SqlSession sqlSession = MybatisUtil.getSession();
        // 创建 Mapper 接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 使用 userMapper 执行根据条件查询用户
        List<User> list = userMapper.queryUserOrder();
        for (User u : list) {
            System.out.println(u);
        }
        // mybatis 和 spring 整合，整合之后，交给spring管理
        sqlSession.close();
    }
}
