import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ToString
@Getter
@Setter
public class Cliente {
    private String nome; //
    private String cpf; //
    private String cpfRecebido;
    private String dataRecebida;
    private LocalDate dataNascimento;
    private int idade;


    public Cliente(String nome, String cpfRecebido, String dataRecebida) throws ParseException, CpfInvalidoException {
        this.nome = nome;
        this.cpf = validarCpf(cpfRecebido);
        this.dataNascimento =  calcularDataNascimento(dataRecebida);
        this. idade = calcularIdade(dataNascimento);
    }

    private LocalDate calcularDataNascimento(String dataRecebida) throws ParseException{
    String formato = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$";
    Pattern pattern = Pattern.compile(formato);
    Matcher matcher = pattern.matcher(dataRecebida);

    if (!matcher.matches()){
        throw new ParseException("O formato correto de data é: dd/MM/yyyy", -1);
    }

    return LocalDate.parse(dataRecebida, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private int calcularIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        if (dataNascimento.getMonthValue() > dataAtual.getMonthValue()) {
            idade = (dataAtual.getYear() - dataNascimento.getYear()) - 1;
        } else if ((dataNascimento.getMonthValue() == dataAtual.getMonthValue()) && (dataNascimento.getDayOfMonth() < dataAtual.getDayOfMonth()) ) {
            idade = (dataAtual.getYear() - dataNascimento.getYear()) - 1;
        } else {
            idade = (dataAtual.getYear() - dataNascimento.getYear());
        }
        return idade;
    }

    private String validarCpf(String cpfRecebido) throws CpfInvalidoException {
        if ((cpfRecebido.length() != 11) || (cpfRecebido.matches("(\\d)\\1{10}"))) {
            throw new CpfInvalidoException("CPF inválido");
        }
        int segundoDigitoVerificador = getSegundoDigitoVerificador(cpfRecebido);
        if (segundoDigitoVerificador >= 10) {
            segundoDigitoVerificador = 0;
        }
        if (segundoDigitoVerificador != (cpfRecebido.charAt(10) - '0')){
            throw new CpfInvalidoException("CPF inválido");
        }
        return cpf = cpfRecebido;

        }
        private static int getSegundoDigitoVerificador(String cpfRecebido) throws CpfInvalidoException {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpfRecebido.charAt(i) - '0') * (10 - i);
            }
        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador >= 10) {
            primeiroDigitoVerificador = 0;
        }
        if (primeiroDigitoVerificador != (cpfRecebido.charAt(9) - '0')) {
            throw new CpfInvalidoException("CPF inválido");
            }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpfRecebido.charAt(i) - '0') * (11 - i);
                }
            return 11 - (soma % 11);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
