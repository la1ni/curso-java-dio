import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// essa classe tem um método de verificação de maioridade

public class Pessoa {
    private String nome;

    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean verificarMaioridade() {
        return getIdade() >= 18;
    }
}
