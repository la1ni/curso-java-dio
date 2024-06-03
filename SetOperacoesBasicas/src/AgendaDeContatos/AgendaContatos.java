package AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        this.conjuntoContatos = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        conjuntoContatos.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(conjuntoContatos);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c: conjuntoContatos)
            if (c.getNome().contains(nome)) {
                contatosEncontrados.add(c);
            }
        return contatosEncontrados;
        }
    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato c: conjuntoContatos)
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
            }
    }
    public static void main(String[] args) {
        AgendaContatos minhaAgenda = new AgendaContatos();
        minhaAgenda.adicionarContato("Luana", 1234);
        minhaAgenda.adicionarContato("Lucas", 1233);
        minhaAgenda.adicionarContato("Karine", 1236);
        minhaAgenda.adicionarContato("Karine Eduarda", 1231);
        minhaAgenda.adicionarContato("Paula", 1232);
        minhaAgenda.exibirContatos();

        minhaAgenda.atualizarNumeroContato("Paula", 4444);
        System.out.println(minhaAgenda.pesquisarPorNome("Karine"));
        System.out.println();
        minhaAgenda.exibirContatos();
    }
}

