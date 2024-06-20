package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRespository respository;
    @Override
    public void run (String... args) throws Exception{
        User user = new User();
        user.setName("Ana");
        user.setUsername("aninha02");
        user.setPassword(String.valueOf(12243));

        respository.save(user);


    }
}
