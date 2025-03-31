package kg.alatoo.demosecurity.bootstrap;

import kg.alatoo.demosecurity.entity.User;
import kg.alatoo.demosecurity.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitUsers implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User admin = User.builder()
                .username("admin")
                .password("admin123")
                .email("admin@alatoo.kg")
                .build();

        User user = User.builder()
                .username("user")
                .password("user123")
                .email("user@alatoo.kg")
                .build();

        userService.saveUser(admin);
        userService.saveUser(user);

    }
}
