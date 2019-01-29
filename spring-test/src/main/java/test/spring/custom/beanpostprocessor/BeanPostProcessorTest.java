package test.spring.custom.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorTest {

    public static void main(String[] args) {
        String[] configLocations = {"spring-custom.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);
        applicationContext.getBean(SingletonBean.class);
    }

}
