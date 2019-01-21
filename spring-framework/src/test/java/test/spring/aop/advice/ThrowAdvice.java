package test.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        ex.printStackTrace();
    }

}
