## Spring启动过程分析

#### AbstractApplicationContext.refresh()

* 创建IOC容器: DefaultListableBeanFactory
* 加载BeanDefinition: AbstractXmlApplicationContext().loadBeanDefinitions()
* XmlBeanDefinitionReader().doLoadBeanDefinitions()
* DefaultBeanDefinitionDocumentReader.doRegisterBeanDefinitions()
