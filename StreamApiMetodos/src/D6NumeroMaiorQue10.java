import java.util.Arrays;
import java.util.List;

public class D6NumeroMaiorQue10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // predicate
        List<Integer> maioresQueDez = numeros.stream().filter(n -> n>10)
                .toList();

        if (maioresQueDez.isEmpty()){
            System.out.println("Não existe nenhum número maior que 10. ");
        } else {
            System.out.println(maioresQueDez);
        }

    }
}
