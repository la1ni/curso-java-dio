import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // lista criada
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Sinaliza que o consumer aceita argumentos do tipo integer e define o métod0 imprimirNumerPar. a expressão lambda recebe numeros e retorna a impressão destes se forem pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if ((numero % 2) == 0) {
                System.out.println(numero);
            }
        };

        // Usa o forEach para iterar sobre a lista passando o método imprimirNumeroPar definido acima
        numeros.forEach(imprimirNumeroPar);
    }
}