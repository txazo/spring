package org.txazo.config.spring.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.txazo.config.TxazoConfig;

public class TxazoNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("config", new TxazoBeanDefinitionParser(TxazoConfig.class));
    }

}
