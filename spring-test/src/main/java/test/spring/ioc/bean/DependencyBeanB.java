package test.spring.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyBeanB {

    @Autowired
    private DependencyBeanA dependencyBeanA;

//    @Autowired
//    public DependencyBeanB(DependencyBeanA dependencyBeanA) {
//        this.dependencyBeanA = dependencyBeanA;
//    }

//    @Autowired
//    public void setDependencyBeanA(DependencyBeanA dependencyBeanA) {
//        this.dependencyBeanA = dependencyBeanA;
//    }

}
