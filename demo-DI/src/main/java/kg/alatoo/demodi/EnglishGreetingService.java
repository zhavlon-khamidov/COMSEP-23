package kg.alatoo.demodi;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("en")
@Service("i18nGreetingService")
public class EnglishGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World!!";
    }
}
