import java.util.Arrays;
import java.util.List;

public class D9Distintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaOrdenada = (List<Integer>) numeros.stream().sorted();

        //List<Integer> repetidos = listaOrdenada.stream();

    }
}
