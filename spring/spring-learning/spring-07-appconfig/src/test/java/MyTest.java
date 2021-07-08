import com.yr.config.MyConfig;
import com.yr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void testConfig(){
        // 注意这里不同的是： XML 要求配置 XML路径； 而 JAVA 要求配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());

    }
}
