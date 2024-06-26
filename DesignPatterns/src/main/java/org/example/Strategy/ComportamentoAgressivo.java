package org.example.Strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public String mover(){
        return "Movimento agressivo";
    }
}
