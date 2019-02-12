package test.spring.aop.annotation;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\test");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/spring/aop/annotation/spring-aop.xml");
        IService iService = applicationContext.getBean(IService.class);
        iService.service();
    }

}
