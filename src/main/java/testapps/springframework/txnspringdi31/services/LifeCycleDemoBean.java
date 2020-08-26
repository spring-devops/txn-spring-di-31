package testapps.springframework.txnspringdi31.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private final static String BeanPrefix = "LifeCycleDemoBean ---> ";
    private static String getFormattedMessafe(String msg) {
        return BeanPrefix + ((msg == null || msg.length() == 0) ? "<NULL MSG>" : msg);
    }
    public LifeCycleDemoBean() {
        System.out.println(getFormattedMessafe("CONSTRUCTOR: In the Constructor"));
    }

    public void beforeInit() {
        System.out.println(getFormattedMessafe("LIFECYCLE-HOOK: Bean Pre-Init Stage"));
    }

    public void afterInit() {
        System.out.println(getFormattedMessafe("LIFECYCLE-HOOK: Bean Post-Init Stage"));
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(getFormattedMessafe("OVERRIDE: Bean Factory has been set"));
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(getFormattedMessafe("OVERRIDE: In Set Bean Name -> " + name));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getFormattedMessafe("OVERRIDE: In After Properties Set"));
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(getFormattedMessafe("OVERRIDE: In Destroy"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(getFormattedMessafe("OVERRIDE: In Set Application Context"));
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getFormattedMessafe("ANNOTATED: In Post Construct"));
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(getFormattedMessafe("ANNOTATED: In Pre-Destroy"));
    }


}
