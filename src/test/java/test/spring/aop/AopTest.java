package test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.aop.service.CommonService;

public class AopTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/spring/aop/spring-aop.xml");
        CommonService commonService = applicationContext.getBean(CommonService.class);
        commonService.common();
    }

}
