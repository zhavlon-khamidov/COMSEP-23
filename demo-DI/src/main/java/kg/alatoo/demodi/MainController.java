package kg.alatoo.demodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    private GreetingService greetingService;


    public MainController(
            @Qualifier("i18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hi from Controller");
        return greetingService.getGreeting();
    }

}
