import com.sunrise.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestSpring {
    public static void main(String[] args) {
        //获取上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        //获取bean的名称
        UserService userService = (UserService) context.getBean("UserServiceImpl");
        //直接调用对象方法
        userService.getUser();

    }
}
