package org.example.Singleton;

// singleton que em um primeiro momento não disponoibiliza a instância
public class SingletonLazy {

    //a variável que representa um objeto da classe deve ser estática pois uma única cópia da variável deve ser acessada em todoo programa

    private static SingletonLazy instancia;

    // construtor deve ser privado, seguido de um método get com uma condicional if que permitirá a que a instância seja criada apenas quando não existir (isso que torna esse singleton Lazy)


    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
