package test.spring.custom.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

    public static void main(String[] args) {
        String[] configLocations = {"spring-custom.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);
        System.out.println(applicationContext.getBean("prototypeFactoryBean"));
        System.out.println(applicationContext.getBean("prototypeFactoryBean"));
        System.out.println(applicationContext.getBean("prototypeFactoryBean"));
    }

}
