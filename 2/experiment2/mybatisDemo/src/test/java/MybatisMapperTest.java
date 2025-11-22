import com.haust.mapper.UserMapper;
import com.haust.pojo.User;
import com.haust.utils.MybatisUtil;
import com.haust.vo.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class MybatisMapperTest {
    private SqlSessionFactory sqlSessionFactory = null;
    @Test
    public void testFindUserByQueryVo(){
        SqlSession sqlSessionFactory = MybatisUtil.getSession();
        UserMapper mapper = sqlSessionFactory.getMapper(UserMapper.class);
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setUsername("张");
        queryVo.setUser(user);
        List<User> list = mapper.findUserByQueryVo(queryVo);
        System.out.println(list);
        sqlSessionFactory.close();
    }
    @Test
    public void testFindUserCount(){
        SqlSession sqlSessionFactory = MybatisUtil.getSession();
        UserMapper mapper = sqlSessionFactory.getMapper(UserMapper.class);
        int result = mapper.findUserCount();
        System.out.println(result);
        sqlSessionFactory.close();
    }
    @Test
    public void testFindUserListResultMap(){
        SqlSession sqlSessionFactory = MybatisUtil.getSession();
        UserMapper mapper = sqlSessionFactory.getMapper(UserMapper.class);
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setId(2);
        queryVo.setUser(user);
        List<User> list = mapper.findUserListResultMap(queryVo);
        System.out.println(list);
        sqlSessionFactory.close();
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSessionFactory = MybatisUtil.getSqlSessionWithParam(true);
        UserMapper mapper = sqlSessionFactory.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("xwj");
        user.setBirthday(new Date());
        user.setSex("1");
        user.setAddress("hhh");
        int result = mapper.insertUser(user);
        System.out.println(result);
        System.out.println(user);
        sqlSessionFactory.close();
    }
}
