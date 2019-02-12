package test.spring.aop.annotation;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class IService {

    private static final Logger LOGGER = Logger.getLogger(IService.class);

    public void service() {
        LOGGER.info("service");
    }

}
