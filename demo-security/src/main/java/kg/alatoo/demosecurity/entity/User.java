package kg.alatoo.demosecurity.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (roles == null) {
            return List.of();
        }
        return roles
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.toString()))
                .toList();
    }

}
