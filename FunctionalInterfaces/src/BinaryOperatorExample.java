import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // reduce tem o identity (primeiro numero do qual a soma começa) e como segundo argumento passar a função lambda como binary operator
        int resultado = numeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("A soma dos números é " + resultado);
    }
}
