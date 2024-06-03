package EstoqueDeProdutos;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty())
            for (Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += (p.getPreco()* p.getQuantidade());

            }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty())
            for (Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos meuEstoque = new EstoqueProdutos();

        meuEstoque.adicionarProduto(21111, "Bola", 12, 4.5);
        meuEstoque.adicionarProduto(217711, "Boliche", 12, 7);
        meuEstoque.adicionarProduto(456789, "Boneca", 15, 16.90);
        meuEstoque.adicionarProduto(1233, "Corda", 5, 5.67);
        meuEstoque.adicionarProduto(34433, "Bambolê", 7, 1);
        meuEstoque.adicionarProduto(337448, "Carrinho", 20, 10.88);

        meuEstoque.exibirProdutos();
        System.out.println(meuEstoque.calcularValorTotalEstoque());
        System.out.println(meuEstoque.obterProdutoMaisCaro());
    }
}
