import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Clóvis", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(24, pessoa.getIdade());
    }

    @Test
    void deveRetornarMaioridade() {
        Pessoa pessoa = new Pessoa("Clóvis", LocalDateTime.of(2010, 1, 1, 15, 0, 0));
        Assertions.assertFalse(pessoa.verificarMaioridade());

        Pessoa pessoa2 = new Pessoa("Helena", LocalDateTime.of(1988, 1, 1, 15, 0, 0));
        Assertions.assertTrue(pessoa2.verificarMaioridade());
    }
}
