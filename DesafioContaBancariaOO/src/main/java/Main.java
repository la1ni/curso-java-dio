
public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco();
        meuBanco.cadastrarNoBanco("1Corrente", "09316270600", "13/09/2002");
        meuBanco.cadastrarNoBanco("2Poupança", "14413536665", "13/09/2007");
        meuBanco.cadastrarNoBanco("3Poupança", "09316270600", "13/09/2012");
        meuBanco.cadastrarNoBanco("4Corrente", "09316270600", "13/09/1988");

        meuBanco.acharContaPorNumero(2).depositar(1000);
        //meuBanco.acharContaPorNumero(3).depositar(2000);
        System.out.println();
        meuBanco.acharContaPorNumero(2).transferir(1000, meuBanco.acharContaPorNumero(4));
        meuBanco.acharContaPorNumero(4).exibirInformacoes();
        System.out.println();
        meuBanco.acharContaPorNumero(2).exibirInformacoes();



    }
}


