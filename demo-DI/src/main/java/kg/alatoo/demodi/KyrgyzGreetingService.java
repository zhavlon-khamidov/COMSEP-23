package kg.alatoo.demodi;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nGreetingService")
@Profile({"kg", "default"})
public class KyrgyzGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Салам Дуйноо!!!";
    }
}
