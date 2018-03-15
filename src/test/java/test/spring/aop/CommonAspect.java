package test.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonAspect {

    private static final Logger LOGGER = Logger.getLogger(CommonAspect.class);

    @Pointcut("execution(* test.spring.aop.service.CommonService.*(..)) &&" +
            "args(java.lang.String)")
    private void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        LOGGER.info("before");
    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        LOGGER.info("afterReturning");
    }

    @After("pointcut()")
    public void after() {
        LOGGER.info("after");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        LOGGER.info("afterThrowing");
    }

    @Around("pointcut()")
    public void around() {
        LOGGER.info("around");
    }

}
