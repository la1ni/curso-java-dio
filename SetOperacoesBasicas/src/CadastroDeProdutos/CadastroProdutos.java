package CadastroDeProdutos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos() {
        this.conjuntoProdutos = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        conjuntoProdutos.add(new Produto(cod, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(conjuntoProdutos);
        return produtosPorNome;
    }
    public Set<Produto>  exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(conjuntoProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos meuCadastro = new CadastroProdutos();
        meuCadastro.adicionarProduto(123334433444L, "Bolinha de Gude", 2.50, 10);
        meuCadastro.adicionarProduto(123334433443L, "Boneca", 15.0, 1);
        meuCadastro.adicionarProduto(123334432333L, "Corda", 5, 2);
        meuCadastro.adicionarProduto(123334433888L, "Bambolê", 7.50, 1);
        meuCadastro.adicionarProduto(123334433744L, "Carrinho", 20, 10);

        System.out.println(meuCadastro.exibirProdutosPorNome());
        System.out.println();
        System.out.println(meuCadastro.exibirProdutosPorPreco());
    }

}
