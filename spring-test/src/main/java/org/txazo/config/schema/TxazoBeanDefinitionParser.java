package org.txazo.config.schema;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class TxazoBeanDefinitionParser implements BeanDefinitionParser {

    private final Class<?> beanClass;

    public TxazoBeanDefinitionParser(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(beanClass);
        beanDefinition.setLazyInit(false);
        if (!parserContext.getRegistry().containsBeanDefinition("txazo-config")) {
            parserContext.getRegistry().registerBeanDefinition("txazo-config", beanDefinition);
        }
        return beanDefinition;
    }

}
