package kg.alatoo.demodi;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller("myController")
public class MainController implements
        BeanPostProcessor
//        BeanNameAware,
//        ApplicationContextAware, InitializingBean, CommandLineRunner
{

    private GreetingService greetingService;
    private String beanName;
    private ApplicationContext context;


    public MainController(
            @Qualifier("i18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hi from Controller: " + beanName);
//        System.out.println(String.join(", ", context.getBeanDefinitionNames()));
        return greetingService.getGreeting();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if (bean instanceof GreetingService)
//            System.out.printf("The bean %s in creating progress%n", beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /*@Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.printf("The bean %s has been created%n", beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }*/



    public void setBeanName(String name) {
        this.beanName = name;
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

//    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MainController properties set successfully");
    }

//    @PostConstruct
    public void runOnInit() {
        System.out.println("MainController initialized");
    }

//    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner in MainController");
    }
}
