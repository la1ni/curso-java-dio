import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("javascript", "python", "html", "java", "c#", "kotlin");

        //passa por meio da lambda a condição que torna true.
        //Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length()>5;

        // o filter verifica quais receberam true pelo método. Se é true, é printada
        // forma simplificada de passar o predicate (dentro do filter)
        palavras.stream()
                .filter(p -> p.length()>5)
                .forEach(System.out::println);
        ;
    }
}
