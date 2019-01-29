package test.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {

    public static void main(String[] args) {
        String[] configLocations = {"spring-ioc.xml", "spring-txazo.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);
        IocController controller = applicationContext.getBean(IocController.class);
        controller.ioc();
    }

}
