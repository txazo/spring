package test.spring.custom.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareTest {

    public static void main(String[] args) {
        String[] configLocations = {"spring-custom.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);
        MyAware myAware = applicationContext.getBean(MyAware.class);
    }

}
