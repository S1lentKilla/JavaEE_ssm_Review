import com.haust.pojo.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 由 Spring 创建 printer 对象，并根据配置文件注入
        // 依赖的组件，完成组装
        Printer printer = (Printer)context.getBean("printer");
        printer.print("几位轻量级容器的作者曾骄傲地对我...");
    }
}
