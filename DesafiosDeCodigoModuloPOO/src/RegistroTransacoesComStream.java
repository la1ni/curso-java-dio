import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            if (transacao.getTipo() == 'D') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S') {
                saldo -= valorTransacao;
            }
        }

        System.out.print("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");
        transacoes.stream()
                .map(Transacao::toString)
                .toList()
                .forEach(System.out::println);

        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipoTransacao, double valorTransacao) {
        this.tipo = Character.toUpperCase(tipoTransacao);
        this.valor = valorTransacao;
    }

    public char getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return Character.toLowerCase(tipo) + " de " + valor;
    }

}
