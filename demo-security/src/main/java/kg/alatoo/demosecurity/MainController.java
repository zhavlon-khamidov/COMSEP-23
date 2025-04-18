package kg.alatoo.demosecurity;

import kg.alatoo.demosecurity.services.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final EmailService emailService;

    @Value("${spring.mail.username}")
    private String username;

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


    @GetMapping("/testmail")
    @ResponseBody
    public String testMail() {
        emailService.sendSimpleMessage(username, "Test Email",
                "Test Email for email working verification");
        return "Email sent";
    }
}
