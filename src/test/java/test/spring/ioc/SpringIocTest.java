package test.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        IocController controller = applicationContext.getBean(IocController.class);
        controller.ioc();
    }

}
