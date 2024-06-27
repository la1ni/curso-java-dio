package dio.design_patterns_spring.service;

import dio.design_patterns_spring.model.Cliente;
import org.springframework.context.annotation.Bean;

// uso do strategy

public interface ClienteService {

    Iterable<Cliente> buscarTodos ();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
