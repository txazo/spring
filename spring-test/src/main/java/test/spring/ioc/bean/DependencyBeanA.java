package test.spring.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyBeanA {

    @Autowired
    private DependencyBeanB dependencyBeanB;

//    @Autowired
//    public DependencyBeanA(DependencyBeanB dependencyBeanB) {
//        this.dependencyBeanB = dependencyBeanB;
//    }

//    @Autowired
//    public void setDependencyBeanB(DependencyBeanB dependencyBeanB) {
//        this.dependencyBeanB = dependencyBeanB;
//    }

}
