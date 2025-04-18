package kg.alatoo.demosecurity.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecurityConfigChecker {

    @Autowired
    public void checkSecurityFilterChain(SecurityFilterChain securityFilterChain) {
        securityFilterChain.getFilters().forEach(
                filter ->{
                    System.out.println("Filter: " + filter.getClass().getSimpleName());
                }
        );
    }


}
