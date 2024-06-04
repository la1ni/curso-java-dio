import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Indica que o supplier gerará String por meio do método saudacao. A função lambda mostra que ele não aceita argumentos e retornará a frase
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações e colocá-las dentro de uma lista
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        // Imprimir as saudações geradas. o :: indica que o sistema irá printar cada uma das saudações
        listaSaudacoes.forEach(System.out::println);
    }
}
