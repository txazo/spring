package test.spring.ioc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.ioc.bean.DependencyBeanA;
import test.spring.ioc.bean.DependencyBeanB;
import test.spring.ioc.bean.LazyInitBean;
import test.spring.ioc.bean.PrototypeBean;
import test.spring.ioc.bean.resource.AAA;
import test.spring.ioc.bean.resource.BBB;

public class IocTest {

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new ClassPathXmlApplicationContext("test/spring/ioc/spring-ioc.xml");
    }

    @Test
    public void testLazyInit() {
        LazyInitBean lazyInitBean = applicationContext.getBean(LazyInitBean.class);
    }

    @Test
    public void testPrototype() {
        PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
        Assert.assertNotSame(prototypeBean1, prototypeBean2);
    }

    @Test
    public void testDependency() {
        DependencyBeanA dependencyBeanA = applicationContext.getBean(DependencyBeanA.class);
        DependencyBeanB dependencyBeanB = applicationContext.getBean(DependencyBeanB.class);
    }

    @Test
    public void testBBB() {
        AAA a1 = (AAA) applicationContext.getBean("a1");
        AAA a2 = (AAA) applicationContext.getBean("a2");
        BBB bbb = applicationContext.getBean(BBB.class);
    }

}
