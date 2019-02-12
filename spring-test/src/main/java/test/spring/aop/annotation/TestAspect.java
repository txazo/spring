package test.spring.aop.annotation;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    private static final Logger LOGGER = Logger.getLogger(TestAspect.class);

    @Pointcut("execution(* test.spring.aop.annotation.IService.*(..))")
    private void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        LOGGER.info("before");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        LOGGER.info("after");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint joinPoint) {
        LOGGER.info("afterReturning");
    }

    @AfterThrowing(value = "pointcut()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        LOGGER.info("afterThrowing");
    }

    @Around("pointcut()")
    public void around(JoinPoint joinPoint) {
        try {
            LOGGER.info("around before");
            ((ProceedingJoinPoint) joinPoint).proceed();
            LOGGER.info("around after");
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

}
