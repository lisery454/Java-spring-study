import com.lisery.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        //从这个上下文对象中获取在xml中注册的对象
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
