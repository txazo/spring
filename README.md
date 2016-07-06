## spring

Spring Framework Source Code Analysis

## 说明

* spring版本: 4.3.0.RELEASE
* jdk版本: 1.8

## 包含的spring模块

* spring-aop
* spring-beans
* spring-context
* spring-core
* spring-expression
* spring-instrument

## BeanFactory

* DefaultListableBeanFactory

## ApplicationContext

* ClassPathXmlApplicationContext

## 过程

* XML -> Resource -> BeanDefinition -> BeanFactory

* 注册BeanDefinition: DefaultBeanDefinitionDocumentReader.parseBeanDefinitions()
* DefaultNamespaceHandlerResolver: Spring命名空间解析

## context:annotation-config

* AnnotationConfigBeanDefinitionParser
* 注册 org.springframework.context.annotation.internalConfigurationAnnotationProcessor
* 注册 org.springframework.context.annotation.internalAutowiredAnnotationProcessor
* 注册 org.springframework.context.annotation.internalRequiredAnnotationProcessor
* 注册 org.springframework.context.annotation.internalCommonAnnotationProcessor
* 注册 org.springframework.context.event.internalEventListenerProcessor
* 注册 org.springframework.context.event.internalEventListenerFactory

## context:component-scan

* ComponentScanBeanDefinitionParser

## ioc注入

* AbstractAutowireCapableBeanFactory.doCreateBean()
* AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues()
