package usuario;
import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        celular.ligar("31997278454");
        celular.selecionarMusica("GREAT APES - RED HOT CHILLI PEPPERS") ;
        celular.exibirPagina("https://github.com/la1ni/curso-java-dio/tree/master");
    }
}