package test.spring.ioc.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");

        People people = applicationContext.getBean("people", People.class);
        Identity identity = applicationContext.getBean("identity", Identity.class);

        people.show();
        identity.show();
    }

}
