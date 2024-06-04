import java.util.Arrays;
import java.util.List;

public class D5MediaMaioresQueCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // predicate
        List<Integer> maioresQueCinco = numeros.stream().filter(n -> n>5)
                .toList();
        // binary operator
        int somaDosMaioresQUeCinco = maioresQueCinco.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(somaDosMaioresQUeCinco/maioresQueCinco.size());
    }
}