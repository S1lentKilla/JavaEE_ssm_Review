import com.haust.mapper.UserMapper;
import com.haust.pojo.User;
import com.haust.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisMapperTest {
    private SqlSessionFactory sqlSessionFactory = null;

    @Test
    public void testQueryUserById() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        // 6. 打印结果
        System.out.println(user);
        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testQueryUserByUsername1() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.queryUserByUsername1("%王%");

        // 6. 打印结果
        for (User user : list) {
            System.out.println(user);
        }
        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testQueryUserByUsername2() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.queryUserByUsername2("王");
        // 6. 打印结果
        for (User user : list) {
            System.out.println(user);
        }
        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testQueryUserByUsername3() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.queryUserByUsername3("王");
        // 6. 打印结果
        for (User user : list) {
            System.out.println(user);
        }
        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testSaveUser1() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 5. 执行SqlSession对象执行保存
        // 创建需要保存的User
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张飞");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");

        mapper.saveUser1(user);
        System.out.println(user);

        // 需要进行事务提交
        sqlSession.commit();

        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testSaveUser2() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 5. 执行SqlSession对象执行保存
        // 创建需要保存的User
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张飞");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");

        mapper.saveUser2(user);
        System.out.println(user);

        // 需要进行事务提交
        sqlSession.commit();

        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testUpdateUserById() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionWithParam(true);
        // 5. 执行SqlSession对象执行更新
        // 创建需要更新的User
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(26);
        user.setUsername("关羽");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");
        mapper.updateUserById(user);
        // 需要进行事务提交
//        sqlSession.commit();
        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testDeleteUserById() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSessionWithParam(true);
        // 5. 执行SqlSession对象执行删除
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(26);
        // 需要进行事务提交
//        sqlSession.commit();
        // 7. 释放资源
        sqlSession.close();
    }
}
