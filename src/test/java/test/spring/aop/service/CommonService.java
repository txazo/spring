package test.spring.aop.service;

import org.apache.log4j.Logger;

public class CommonService {

    private static final Logger LOGGER = Logger.getLogger(CommonService.class);

    public void common() {
        LOGGER.info("common");
    }

}
