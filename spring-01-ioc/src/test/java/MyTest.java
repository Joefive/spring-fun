
import com.sunrise.dao.UserMysqlImpl;
import com.sunrise.service.UserService;
import com.sunrise.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserMysqlImpl());
        userService.getUser();
    }
}
