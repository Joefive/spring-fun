import com.sunrise.config.UserConfig;
import com.sunrise.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果脱离配置文件需要使用AnnotationConfigApplicationContext上下文来获取容器，通过配置文件.class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        //获取的bean名称在配置类中获取，生成对应的对象
        User getUser = context.getBean("user", User.class);
        String name = getUser.getName();
        System.out.println(name);
    }
}
