package test.spring.aop;

import org.springframework.aop.framework.ProxyFactory;
import test.spring.aop.advice.AfterAdvice;
import test.spring.aop.advice.BeforeAdvice;
import test.spring.aop.advice.RoundAdvice;
import test.spring.aop.advice.ThrowAdvice;
import test.spring.aop.service.CommonService;

public class AdviceTest {

    public static void main(String[] args) {
        CommonService commonService = new CommonService();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(commonService);
        proxyFactory.addAdvice(new BeforeAdvice());
        proxyFactory.addAdvice(new RoundAdvice());
        proxyFactory.addAdvice(new AfterAdvice());
        proxyFactory.addAdvice(new ThrowAdvice());
        // proxyFactory.addAdvice(new IntroductionAdvice());
        CommonService proxy = (CommonService) proxyFactory.getProxy();
        proxy.common("aop");
    }

}
