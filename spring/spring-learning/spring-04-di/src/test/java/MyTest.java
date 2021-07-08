import com.yr.pojo.Student;
import com.yr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testNewStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("di04beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void testNewUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user2", User.class);

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
    }

    @Test
    public void testScope(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user1 = context.getBean("user3", User.class);
        User user2 = context.getBean("user3", User.class);

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user1 == user2);
    }
}
