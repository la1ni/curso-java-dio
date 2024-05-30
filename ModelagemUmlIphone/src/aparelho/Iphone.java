package aparelho;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
        @Override
        public void ligar(String numero) {
                System.out.println("CHAMANDO " + numero);
        }
        @Override
        public void atender (){
                System.out.println("EM LIGAÇÃO");
        }
        @Override
        public void iniciarCorreioVoz(){
                System.out.println("CORREIO DE VOZ INICIADO");
        }
        @Override
        public void exibirPagina(String url){
                System.out.println("CLIQUE PARA ACESSAR: "+ url);
        }
        @Override
        public void adicionarNovaAba(){
                System.out.println("ABA ADICIONADA");
        }
        @Override
        public void atualizarPagina(){
                System.out.println("PÁGINA ATUALIZADA");
        }
        @Override
        public void tocar() {
                System.out.println("TOCANDO MÚSICA");
        }
        @Override
        public void pausar(){
                System.out.println("MÚSICA PAUSADA");
        }
        @Override
        public void selecionarMusica(String musica){
                System.out.println("TOCANDO "+  musica);
        }
}

