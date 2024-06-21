package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// os métodos http da classe Usuario ficam nesta classe

@RestController
@RequestMapping ("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    // delegando a lógica para a classe repositpry
    @GetMapping ()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping ("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping ()
    public void postUser (@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
