package kg.alatoo.demodi;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nGreetingService")
@Profile("ru")
public class RussianGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Привет Мир!!!";
    }
}
