import com.lisery.dao.UserDaoMysqlImpl;
import com.lisery.service.UserService;
import com.lisery.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
