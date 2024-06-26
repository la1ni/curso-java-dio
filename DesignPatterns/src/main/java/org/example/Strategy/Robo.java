package org.example.Strategy;

// a classe tem como atributo um objeto de outra classe, e dependendo do tipo de objeto, pode realizar diferentes ações. nesse caso, o método mover() pode ser feito de forma defensiva, agressiva ou normal, de acordo com o tipo de objeto comportamento que será recebido
public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public String mover() {
        return comportamento.mover();
    }
}
