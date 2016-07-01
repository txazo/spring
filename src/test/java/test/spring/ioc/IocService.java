package test.spring.ioc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class IocService {

    private static final Logger LOG = Logger.getLogger(IocService.class);

    public void ioc() {
        LOG.debug("IocService ioc");
    }

}
