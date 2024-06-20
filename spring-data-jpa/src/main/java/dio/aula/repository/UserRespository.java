package dio.aula.repository;
import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Integer>{
}
