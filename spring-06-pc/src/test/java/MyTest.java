import com.sunrise.interaction.impl.ManImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManImpl manImpl = context.getBean("manImpl2", ManImpl.class);
        manImpl.say();
        manImpl.make();
        //测试配置文件中同一个类需要实例化几次
        ManImpl manImpl2 = context.getBean("manImpl", ManImpl.class);
        System.out.println(manImpl);
        System.out.println(manImpl2);
        System.out.println("判断地址是否相同：" + (manImpl == manImpl2));


    }
}
