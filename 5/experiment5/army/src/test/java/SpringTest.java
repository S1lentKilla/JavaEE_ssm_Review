import com.haust.Army;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testIoC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 由 Spring 创建 army 对象，并根据配置文件注入
        // 依赖的组件，完成组装
        Army army = (Army)context.getBean("army");
        army.attackall();
    }
}
