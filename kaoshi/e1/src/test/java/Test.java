import com.haust.mapper.SignonMapper;
import com.haust.pojo.Signon;
import com.haust.utils.Mybatis;
import org.apache.ibatis.session.SqlSession;

public class Test {
    @org.junit.Test
    public void test() {
        SqlSession s= Mybatis.getSqlSession();
        SignonMapper mapper = s.getMapper(SignonMapper.class);
        Signon signon = new Signon();
        signon.setUsername("admin");
        signon.setJobs("student");
        signon.setPhone("12345678902");
        int res = mapper.insertSignon(signon);
        s.commit();
//        ***
        System.out.println(signon.getId());
        s.close();
    }
}
