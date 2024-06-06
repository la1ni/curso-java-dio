import lombok.Getter;
import lombok.ToString;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
public class Banco {
    private List<Conta> listaContas;

    public Banco() {
        this.listaContas = new ArrayList<>();
    }

    public void cadastrarNoBanco(String nome, String cpf, String dataNascimento) {
        try {
            Cliente cliente = new Cliente(nome, cpf, dataNascimento);
            Conta conta = criarConta(cliente);
            listaContas.add(conta);

        } catch (ParseException parseException) {
            System.out.println(parseException.getMessage());
        } catch (CpfInvalidoException cpfInvalido) {
            System.out.println(cpfInvalido.getMessage());
        }
    }
    public Conta criarConta(Cliente cliente){
        Conta conta = null;
        if (cliente.getIdade() < 18) {
            ContaPoupanca c = new ContaPoupanca(cliente);
            conta = c;
            conta = c;
        } else {
            ContaCorrente c = new ContaCorrente(cliente);
            conta = c;
        }
    return conta;

    }
}