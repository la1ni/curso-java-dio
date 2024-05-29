import java.util.Locale;
import java.util.Scanner;
public class DesafioCalculoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor bruto do salário: ");
        float valorSalarioBruto = scanner.nextFloat();
        System.out.println("Digite o valor total dos benefícios: ");
        float valorBeneficios = scanner.nextFloat();
        float imposto;
        if (valorSalarioBruto <= 1100.00f) {
            imposto = 0.05F;
        } else if ((1100.00F < valorSalarioBruto) && valorSalarioBruto <= 2500.00F) {
            imposto = 0.1F;
        } else {
            imposto = 0.15F;
        }
        float salarioFinal = valorSalarioBruto-(valorSalarioBruto*imposto) + valorBeneficios;
        System.out.printf("%.2f%n", salarioFinal);

        }
    }

