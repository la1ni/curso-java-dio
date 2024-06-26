package org.example.Singleton;

public class SingletonEager {

    // quando a classe é compilada, a instância desse objeto já é criada (isso caracteriza-o como eager)

    private static SingletonEager instancia = new SingletonEager();

    // construtor privado para caracterizar o singleton
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
