package test.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class RoundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object result = null;
        System.out.println("环绕增强");
        result = invocation.proceed();
        System.out.println("环绕增强");
        return result;
    }

}
