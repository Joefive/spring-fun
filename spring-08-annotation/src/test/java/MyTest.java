import com.sunrise.pojo.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_08.xml");
        Man man = context.getBean("man", Man.class);
        System.out.println(man.getName());
    }
}
