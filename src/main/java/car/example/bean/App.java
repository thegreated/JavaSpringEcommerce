package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args)
    {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationBenContext.xml");

        MyBean myBean = (MyBean) context.getBean("MyBean");
        System.out.println(myBean);
    }
}
