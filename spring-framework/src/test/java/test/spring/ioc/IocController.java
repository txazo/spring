package test.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class IocController {

    @Autowired
    private IocService service;

    public void ioc() {
        service.ioc();
    }

}
