import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int parametro_1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametro_2 = scanner.nextInt();
        try {
        int contagem = contar(parametro_1, parametro_2);
            for (int i = 1; i <= contagem; i++)
                System.out.println(i);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro deve ser maior que o segundo");
        }
    }

    static int contar(int parametro_1, int parametro_2) throws ParametrosInvalidosException {
        if (parametro_2 > parametro_1)
            throw new ParametrosInvalidosException ();
        return parametro_1 - parametro_2;
    }


}
