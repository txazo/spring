package test.spring.aop.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;
import test.spring.aop.service.OtherInterface;

public class IntroductionAdvice implements OtherInterface, IntroductionInterceptor {

    @Override
    public boolean implementsInterface(Class<?> intf) {
        return intf.isAssignableFrom(OtherInterface.class);
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if (implementsInterface(invocation.getMethod().getDeclaringClass())) {
            return invocation.getMethod().invoke(this, invocation.getArguments());
        }
        return invocation.proceed();
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }

}
