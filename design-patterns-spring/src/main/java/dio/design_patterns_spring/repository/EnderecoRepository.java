package dio.design_patterns_spring.repository;

import dio.design_patterns_spring.model.Cliente;
import dio.design_patterns_spring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
