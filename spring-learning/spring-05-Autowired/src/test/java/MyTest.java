import com.yr.pojo.Cat;
import com.yr.pojo.Dog;
import com.yr.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Cat cat = context.getBean("cat", Cat.class);
        Dog dog = context.getBean("dog", Dog.class);
        People people = context.getBean("people", People.class);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(people);
        cat.shout();
        dog.bark();
    }

    @Test
    public void testByName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people3", People.class);
        System.out.println(people.getName());
        people.getCat().shout();
        people.getDog().bark();
    }

    @Test
    public void testAutowired(){
        ApplicationContext context = new ClassPathXmlApplicationContext("innoBeans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().bark();
    }
}
