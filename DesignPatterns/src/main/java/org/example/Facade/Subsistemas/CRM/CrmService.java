package org.example.Facade.Subsistemas.CRM;

public class CrmService {
    private CrmService(){
        super();
    }

    public static String gravarCliente(String nome, String cep, String cidade, String Estado){
        return "Cliente Salvo";
    }
}
