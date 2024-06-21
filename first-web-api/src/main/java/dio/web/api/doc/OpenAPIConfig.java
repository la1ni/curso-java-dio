package dio.web.api.doc;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI myOpenAPI() {

        Contact contact = new Contact();
        contact.setEmail("email@teste");
        contact.setName("Mariana Lainara");
        contact.setUrl("https://github.com/la1ni");

        Info info = new Info()
                .title("API Exemplo")
                .version("1.0")
                .contact(contact)
                .description("API para fins de estudo");

        return new OpenAPI().info(info);
    }
}