import com.yr.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testNewStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("di04beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }
}
