import com.sunrise.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext11.xml");
        //动态代理的是一个接口
        UserService userService = context.getBean("userService", UserService.class);
        userService.insert();
    }
}
