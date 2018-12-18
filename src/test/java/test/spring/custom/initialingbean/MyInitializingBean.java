package test.spring.custom.initialingbean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("MyInitializingBean afterPropertiesSet");
    }

}
