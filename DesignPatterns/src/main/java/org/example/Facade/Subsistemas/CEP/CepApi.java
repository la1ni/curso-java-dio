package org.example.Facade.Subsistemas.CEP;

// usado um singletonEager para facilitar
public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    // apenas para ilustração
    public String recuperarCidade(String cep) {
        return "Paraopeba";
    }
    public String recuperarEstado(String cep) {
        return "Minas Gerais";
    }
}
