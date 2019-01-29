package test.spring.custom.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PrototypeFactoryBean implements FactoryBean<PrototypeBean> {

    @Override
    public PrototypeBean getObject() throws Exception {
        return new PrototypeBean();
    }

    @Override
    public Class<?> getObjectType() {
        return PrototypeBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
