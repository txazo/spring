package test.spring.ioc.scope;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");

        SingletonObject singletonObject1 = applicationContext.getBean("singletonObject", SingletonObject.class);
        SingletonObject singletonObject2 = applicationContext.getBean("singletonObject", SingletonObject.class);
        PrototypeObject prototypeObject1 = applicationContext.getBean("prototypeObject", PrototypeObject.class);
        PrototypeObject prototypeObject2 = applicationContext.getBean("prototypeObject", PrototypeObject.class);

        Assert.assertSame(singletonObject1, singletonObject2);
        Assert.assertNotSame(prototypeObject1, prototypeObject2);
    }

}
