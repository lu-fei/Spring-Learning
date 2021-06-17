import com.yr.dao.UserMapper;
import com.yr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void testGetUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.selectUsers();
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void testGet(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
        System.out.println(user.getId());
    }
}
