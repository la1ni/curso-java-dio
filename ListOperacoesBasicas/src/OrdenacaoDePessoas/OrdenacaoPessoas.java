package OrdenacaoDePessoas;

import java.util.*;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public static void main(String[] args) {
        OrdenacaoPessoas minhaOrdem = new OrdenacaoPessoas();
        minhaOrdem.adicionarPessoa("Ana", 15, 1.65);
        minhaOrdem.adicionarPessoa("Pedro", 45, 1.56);
        minhaOrdem.adicionarPessoa("Joana", 78, 1.70);
        minhaOrdem.adicionarPessoa("Leia", 54, 1.98);

        System.out.println(minhaOrdem.ordenarPorAltura());
        System.out.println();
        System.out.println(minhaOrdem.ordenarPorIdade());

    }
}

