package kg.alatoo.demosecurity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String homePage() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        Object principal = authentication.getPrincipal();
        System.out.println("authentication.getCredentials() = " + authentication.getCredentials());
        if (principal instanceof UserDetails) {
            System.out.printf("%s : %s%n",
                    ((UserDetails) principal).getUsername(),
                    ((UserDetails) principal).getPassword());
        }
        System.out.println("Home page");
        return "home";
    }
}
