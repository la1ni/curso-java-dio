package CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // indica que a classe terá como atributo a lista de livros (passando por meio do diamond operator que ela aceitará objetos do tipo Livro)
    private List<Livro> listaLivros ;

    // construtor que especifica que toda vez que um objeto da classe for criado, automaticamente será criada uma lista vazia
    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros){
                if (l.getAnoPubicacao() >= anoInicial && l.getAnoPubicacao() <= anoFinal)
                    livrosPorIntervalo.add(l);
            }
        }
        return livrosPorIntervalo;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros meuCatalogo = new CatalogoLivros();
        meuCatalogo.adicionarLivro("A Divina Comédia", "Dante Alighieri", 1473);
        meuCatalogo.adicionarLivro("Anna Karenina", "Tolstoi", 1873);
        meuCatalogo.adicionarLivro("1984", "George Orwell", 1948);
        meuCatalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1900);
        System.out.println(meuCatalogo.pesquisarPorTitulo("1984"));
        System.out.println(meuCatalogo.pesquisarPorAutor("Tolstoi"));
        System.out.println(meuCatalogo.pesquisarPorIntervaloAnos(1900, 2000));



    }

}
