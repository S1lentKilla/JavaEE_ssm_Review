import com.haust.pojo.Jihe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Jihe jihe = applicationContext.getBean("jihe", Jihe.class);
        System.out.println(jihe);
    }
}
