package test.spring.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class CommonService {

    private static final Logger LOGGER = Logger.getLogger(CommonService.class);

    public void common(String name) {
        LOGGER.info("common " + name);
    }

}
