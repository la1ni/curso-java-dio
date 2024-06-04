import java.util.Arrays;
import java.util.List;

public class D3NumerosPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 5, -4, 3);

        // predicate
        numeros.stream()
                .filter(n->n >= 0)
                .forEach(System.out::println);
    }
}
