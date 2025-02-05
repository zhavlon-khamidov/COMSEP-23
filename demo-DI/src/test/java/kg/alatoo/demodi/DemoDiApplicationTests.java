package kg.alatoo.demodi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("ru")
class DemoDiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MainController mainController;

    @Test
    void contextLoads() {

        MainController bean = applicationContext.getBean(MainController.class);
        System.out.println(bean.sayHello());
    }

}
