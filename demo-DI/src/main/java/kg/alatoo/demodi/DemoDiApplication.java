package kg.alatoo.demodi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoDiApplication.class, args);

        MainController bean = applicationContext.getBean(MainController.class);
        System.out.println(bean.sayHello());
    }

}
