package dio.design_patterns_spring.service;

import dio.design_patterns_spring.model.Cliente;
import dio.design_patterns_spring.model.Endereco;
import dio.design_patterns_spring.repository.ClienteRepository;
import dio.design_patterns_spring.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ClienteServiceImplementation implements ClienteService {

    // cria uma instância do clienteRepositpry e do enderecoRepository para ter a capacidade de acessar os métodos providos pela interface, como findAll(), etc
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    // chama o serviço do viaCep
    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarEndNoCliente(cliente);
        clienteRepository.save(cliente);

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // verifica se o cliente existe
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()){
            // se sim, salva endereço novo no cliente (passado no corpo da requisição) e sobrescreve ao antigo
            salvarEndNoCliente(cliente);

            // o id passado no corpo da requisição é sobrescrito para não ficar como null
            cliente.setId(id);

            // o nome também é sobrescrito para não ficar como null. para achar o nome, basta buscar no bd o que está correntemente salvo
            cliente.setNome(clienteRepository.findById(id).get().getNome());


            // depois de todas essas alterações o cliente é corretamente sobrescrito
            clienteRepository.save(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // verifica se o cliente existe
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()){
            clienteRepository.delete(clienteOptional.get());
        }
    }

    private void salvarEndNoCliente(Cliente cliente) {
        // verifica se o endereço do cliente está no banco. Caso contrário, provê a inclusão do endereço no banco (depois de consumir a api do viaCep)
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        // adiciona endereço ao cliente
        cliente.setEndereco(endereco);

    }

}
