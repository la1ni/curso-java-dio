import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements InterfaceConta{
    private static final int AGENCIA_PADRAO = 11005;
    private static int SEQUENCIAL = 1;

    protected int numeroAgencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.numeroAgencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;

    }

    @Override
    public void sacar(double valor) {
    saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);

    }
    @Override
    public void exibirInformacoes(){
        System.out.println("Conta: " + getNumeroConta());
        System.out.println("Agência: " + getNumeroAgencia());
        System.out.println("Saldo atual: "+ getSaldo());

    }
}
