public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void transferir(double valor, @org.jetbrains.annotations.NotNull Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
}
