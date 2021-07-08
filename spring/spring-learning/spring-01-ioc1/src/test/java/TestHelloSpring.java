import com.yr.temp.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
    @Test
    public void testPrint(){
        ApplicationContext context = new ClassPathXmlApplicationContext("helloSpringBeans.xml");
        HelloSpring obj = (HelloSpring) context.getBean("hello");
        System.out.println(obj.toString());
    }
}
