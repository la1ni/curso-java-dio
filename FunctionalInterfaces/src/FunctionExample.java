import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Institui o método dobrar, que recebe integer e retorna integer. A função lambda diz que após passar pela função, o número passará a estar dobrado. Uma das formas de fazer. Outra forma está descomentada abaixo
        //Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Cria uma lista para receber os números dobrados. Passa a lista de números para stream e dobra todos pelo map. O toList os armazena na lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n*2)
                .toList();

        // Para cada número da lista, printar
        numerosDobrados.forEach(System.out::println);
        }
    }

