import com.yr.dao.UserMapper;
import com.yr.dao.UserMapperImpl;
import com.yr.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyTest {
    @Test
    public void testGetUser() throws IOException {
        // 获取sqlSession对象
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);    // 打开事务的自动提交

        // 执行 getUser 逻辑
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser();
        for(User user : users){
            System.out.println("userName:\t" + user.getName() + "; userPWD\t" + user.getPwd());
        }
    }

    @Test
    public void testGetUser2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        // 现在，什么sqlSession 我们都不需要了
        List<User> users = userMapper.selectUser();
        for(User user : users){
            System.out.println(user);
        }
    }

}
