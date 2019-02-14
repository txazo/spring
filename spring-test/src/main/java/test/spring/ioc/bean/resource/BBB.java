package test.spring.ioc.bean.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BBB {

    @Resource
    private AAA a1;

}
