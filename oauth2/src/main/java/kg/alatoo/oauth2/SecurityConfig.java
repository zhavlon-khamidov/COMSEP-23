package kg.alatoo.oauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .oauth2Login(oauth2 -> {
                    oauth2.successHandler((request, response, authentication) -> response.sendRedirect("/profile"));
                    oauth2.loginPage("/login");
                })
                .formLogin(form -> form.loginPage("/login"))
//                .userDetailsService(userDetailsManager())
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/login").permitAll()
                                .anyRequest().authenticated())
                ;

        return http.build();
    }


    @Bean
    InMemoryUserDetailsManager userDetailsManager() {
        UserDetails user = User.builder()
                .username("user")
                .password("password")
                .roles("USER").build();
        return new InMemoryUserDetailsManager(user);
    }
}
