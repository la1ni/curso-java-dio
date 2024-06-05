import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class D9Distintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaOrdenada = numeros.stream().sorted().toList();

        List<Integer> listaFinal = new ArrayList<>();

        for (Integer i : listaOrdenada){
            long contagem = listaOrdenada.stream().filter(n -> Objects.equals(n, i)).count();
            if (contagem == 1) {
                listaFinal.add(i);
            }
        }
        System.out.println("Os números que não se repetem são: " + listaFinal);


    }
}
