import com.haust.dao.UserDao;
import com.haust.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testIoC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao= (UserDao) context.getBean("userDao");
        userDao.say();
    }
    @Test
    public void testDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService= (UserService) context.getBean("userService");
        userService.say();
    }
}
