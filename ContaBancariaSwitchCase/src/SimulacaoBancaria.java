import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDepositado = scanner.nextDouble();
                    saldo = saldo + valorDepositado;
                    System.out.print("Saldo atual: ");
                    System.out.printf("%.1f", saldo);
                    System.out.println();
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if (valorSacado>saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valorSacado;
                        System.out.print("Saldo atual: ");
                        System.out.printf("%.1f", saldo);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Saldo atual: ");
                    System.out.printf("%.1f", saldo);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}