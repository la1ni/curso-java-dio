package dio.design_patterns_spring.controller;

import dio.design_patterns_spring.model.Cliente;
import dio.design_patterns_spring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;


    // ResponseEntity é uma classe do Spring usada para representar toda a resposta HTTP (incluindo cabeçalhos, corpo e status)

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Cliente> buscarPorId (@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir (@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    // o put pega tanto a PathVariable quanto o RequestBody
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar (@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
