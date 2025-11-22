import com.haust.dao.OrderDao;
import com.haust.dao.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class SpringTest {
    @Resource(name="orderDao")
    private OrderDao orderDao;

//    @Resource(name="productDao")
//    private ProductDao productDao;

    @Test
    public void orderTest(){
        orderDao.save();
        orderDao.update();
        orderDao.delete();
        orderDao.find(2);
    }
    @Test
    public void productTest(){
        String res="beanAnno.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(res);
//        ProductDao productDao = context.getBean("productDao",ProductDao.class);
        ProductDao productDao = context.getBean(ProductDao.class);
        productDao.save();
        productDao.update();
        productDao.delete();
        productDao.find();
    }
}
