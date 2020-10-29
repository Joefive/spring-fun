import com.sunrise.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        //1.普通属性注入
        String name = person.getName();
        System.out.println("获取姓名：" + name);
        //3.数组注入
        String[] book = person.getBook();
        System.out.println(Arrays.toString(book));
        //4.List注入
        List<String> hobby = person.getHobby();
        Iterator<String> it = hobby.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.print("爱好" + i + ":" + it.next() + ";");
            i++;
            if (i == hobby.size() + 1) {
                System.out.println();
            }
        }
        //5.Map注入
        Map<String, String> card = person.getCard();
        Set<String> strings = card.keySet();
        Iterator<String> it1 = strings.iterator();
        while (it1.hasNext()) {
            String next = it1.next();
            String s = card.get(next);
            System.out.println(next + "-" + s);
        }
        System.out.println("=================");
        //打印全部
        System.out.println(person.toString());

    }
}
