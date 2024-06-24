package dio.spring_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private SecurityDatabaseService securityService;
    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }


    // permite a implementação de uma hierarquia de papéis, na qual, nesse caso, MANAGER possui todas as autorizações de USER
    @Bean
    static RoleHierarchy roleHierarchy() {
        return RoleHierarchyImpl.withDefaultRolePrefix()
                .role("MANAGER").implies("USER")
                .build();
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/users/**").hasRole("USER")
                        .requestMatchers("/managers/**").hasRole("MANAGER")
                        .anyRequest().denyAll()
                )
                .formLogin(withDefaults());
        return http.build();
    }

    /*

    É assim que se salva usuários na memória. deixando apenas para fins de comparação


    @Bean
    public InMemoryUserDetailsManager userDetailsService() {


        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("senha123")
                .roles("USER")
                .build();

        UserDetails manager = User.withDefaultPasswordEncoder()
                .username("manager")
                .password("senha")
                .roles("MANAGER")
                .build();

        return new InMemoryUserDetailsManager(user, manager);
    }
    */
}




