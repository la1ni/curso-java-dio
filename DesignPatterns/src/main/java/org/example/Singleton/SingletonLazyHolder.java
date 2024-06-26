package org.example.Singleton;

// possui uma classe estática interna para encapsular a instância (holder) detentora da instância. tem uma melhor otimização de memória
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
