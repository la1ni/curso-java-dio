import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu primeiro nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            scanner.close();
            System.out.println("nome completo: "+ nome + " " + sobrenome);
            System.out.println("idade: "+ idade + " anos");
            System.out.println("altura: "+ altura + "m");
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos. Altura deve ser informada com ponto");
        }

    }
}