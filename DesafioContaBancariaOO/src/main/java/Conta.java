import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
        System.out.println("O novo saldo é: " + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O novo saldo é: " + saldo);
        }
    @Override
    public void exibirInformacoes(){
        System.out.println("Cliente: " + getCliente().getNome().toUpperCase());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Agência: " + getNumeroAgencia());
    }

}

