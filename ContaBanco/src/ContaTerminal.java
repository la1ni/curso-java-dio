import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Qual o seu saldo (informe centavos): ");
        float saldo = scanner.nextFloat();
        System.out.println("Olá, " + nomeCliente+"! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia+", conta "+ numeroDaConta+ " e seu saldo de R$"+ saldo +" já está disponível para saque.");
        scanner.close();



    }
}