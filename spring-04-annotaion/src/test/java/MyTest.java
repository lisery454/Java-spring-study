import com.lisery.config.MyConfig;
import com.lisery.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
