import com.sunrise.dao.Student;
import com.sunrise.dao.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application04.xml");
        Student student = (Student) context.getBean("xuesheng");
        student.show();

        Teacher teacher = (Teacher) context.getBean("teacher2");
        teacher.show();
    }
}
