package kg.alatoo.demodi;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        System.out.println("inside greeting service implementation");
        return "Hello From Greeting Service";
    }
}
