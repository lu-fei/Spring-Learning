import com.yr.service.UserService;
import com.yr.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 动态代理，代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();

    }

    @Test
    public void testDiy(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    @Test
    public void testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

}
