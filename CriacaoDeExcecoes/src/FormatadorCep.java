import java.util.Scanner;

static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8 || (!cep.matches("\\d+")))
        throw new CepInvalidoException();
    return "CEP formatado: " + String.format("%s-%s", cep.substring(0, 5), cep.substring(5));
}

public static void main() {
    boolean a = true;
    do {
        try {
            String cepFormatado = formatarCep(digitarCep());
            a = false;
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP deve ter 8 caracteres numéricos. Tente novamente.");
        }
    }
    while (a);
}

static String digitarCep() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu cep: ");
    String cepTeclado = scanner.nextLine();
    return cepTeclado;


}