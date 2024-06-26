package org.example.Facade;

// O uso do facade é no sentido de permitir interação por meio de uma interface simples para subsistemas complexos. nesse caso, para exemplificar, foi usada uma situação de migração de uma base de clientes na qual para salvar o cliente no crm, são necessários dados que só podem ser obtidos pelo subsistema de cepApi

import org.example.Facade.Subsistemas.CEP.CepApi;
import org.example.Facade.Subsistemas.CRM.CrmService;

public class Facade {

    // a facade vai através da apiCep, buscar os dados de cidade e estado para que o cliente possa ser salvo no CRM. ela faz essa ponte

    public String migrarCliente (String nome, String cep){

        String recuperarCidade = CepApi.getInstance().recuperarCidade(cep);

        String recuperarEstado = CepApi.getInstance().recuperarEstado(cep);

        return CrmService.gravarCliente(nome, cep, recuperarCidade, recuperarEstado);
    }
}
