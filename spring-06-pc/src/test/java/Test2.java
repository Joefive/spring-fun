import com.sunrise.applogic.ManAo;
import com.sunrise.applogic.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ManAo manAo = new ManAo();
        manAo.say();
        //测试C,P标签
        System.out.println("============================");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println("1:"+user);
        User user2 = context.getBean("user", User.class);
        System.out.println("2:"+user2);
        //判断两个对象是否相同
        System.out.println("判断两个对象是否相同：" + (user == user2));


    }
}
