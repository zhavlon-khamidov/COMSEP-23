package kg.alatoo.demodi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication implements BeanPostProcessor {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoDiApplication.class, args);

        MainController bean = applicationContext.getBean(MainController.class);
        System.out.println(bean.sayHello());
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof GreetingService) {
            System.out.println(beanName);
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
