import com.haust.mapper.UserMapper;
import com.haust.pojo.User;
import com.haust.utils.MybatisUtil;
import com.haust.vo.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MybatisMapperTest {
    @Test
    public void testQueryUserByWhere(){
        // mybatis和spring整合，整合之后，交给spring管理
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 创建Mapper接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 使用userMapper执行根据条件查询用户
        User user = new User();
        user.setSex("1");
        user.setUsername("张");
        List<User> users = userMapper.queryUserByWhere(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
        // mybatis和spring整合，整合之后，交给spring管理
        sqlSession.close();
    }
    @Test
    public void testQueryUserByWhere1(){
        // mybatis和spring整合，整合之后，交给spring管理
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 创建Mapper接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 使用userMapper执行根据条件查询用户
        User user = new User();
        user.setSex("1");
        user.setUsername("张");
        List<User> users = userMapper.queryUserByWhere1(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
        // mybatis和spring整合，整合之后，交给spring管理
        sqlSession.close();
    }
    @Test
    public void testQueryUserByWhere2(){
        // mybatis和spring整合，整合之后，交给spring管理
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 创建Mapper接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 使用userMapper执行根据条件查询用户
        User user = new User();
        user.setSex("1");
        user.setUsername("张");
        List<User> users = userMapper.queryUserByWhere2(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
        // mybatis和spring整合，整合之后，交给spring管理
        sqlSession.close();
    }
    @Test
    public void testQueryUserByIds(){
        // mybatis和spring整合，整合之后，交给spring管理
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 创建Mapper接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 使用userMapper执行根据条件查询用户
        QueryVo queryVo = new QueryVo();
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(10);
        ids.add(24);
        queryVo.setIds(ids);
        List<User> users = userMapper.queryUserByIds(queryVo);
        for (User user1 : users) {
            System.out.println(user1);
        }
        // mybatis和spring整合，整合之后，交给spring管理
        sqlSession.close();
    }

}
