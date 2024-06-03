package CatalogoDeLivros;

public class Livro {

    // atributos
    private String titulo;
    private String autor;
    private int anoPubicacao;

    // construtor
    public Livro(String titulo, String autor, int anoPubicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubicacao = anoPubicacao;
    }
    // getters e setters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPubicacao() {
        return anoPubicacao;
    }
    // toString para exibir os objetos
    @Override
    public String toString() {
        return "Livro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Ano de Pubicacao=" + anoPubicacao +
                '}';
    }
}
