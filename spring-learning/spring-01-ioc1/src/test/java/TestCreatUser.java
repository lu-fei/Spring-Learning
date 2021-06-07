import com.yr.dao.UserDao;
import com.yr.dao.UserDaoImpl;
import com.yr.dao.UserDaoMysqlImpl;
import com.yr.service.UserService;
import com.yr.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCreatUser {
    @Test
    public void test1(){
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());

        userService.getUser();
    }

    @Test
    public void testGetUserBySpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService serviceImpl = (UserService)context.getBean("serviceImpl");
        serviceImpl.getUser();
    }

}
