package test.spring.custom.initialingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingBeanTest {

    public static void main(String[] args) {
        String[] configLocations = {"spring-custom.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);
        applicationContext.getBean(MyInitializingBean.class);
    }

}
