package dio.design_patterns_spring.service;

import dio.design_patterns_spring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// client HTTP criado via OpenFeing para consumo da api ViaCep

@FeignClient (name = "viaCep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    // faz um get na api do via cep retornando o endereço em formato json e criando um objeto Endereco (mapeado com base nos parâmetros passados no site do viaCep)
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
