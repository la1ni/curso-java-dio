package ListaDeTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    // atributo que contém a lista
    private List<Tarefa> tarefaList;

    // construtor que especifica que toda vez que um objeto da classe for criado, automaticamente será criada uma lista vazia
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        // cria um objeto da classe tarefa passando a descrição e adiciona essa tarefa à lista de tarefas
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        // cria lista de tarefas para remover evitar que tarefas duplicadas sejam apenas parcialmente deletadas
        List<Tarefa> tarefasParaRemover = new ArrayList<>() ;
        // para cada tarefa na lista de tarefas geral, se a descrição for igual à passada em removerTarefa, é adicionada à lista de tarefas para remover. no fim, todas as tarefas dessa lista são removidas de dentro da lista geral de tarefas
        for (Tarefa t : tarefaList)
            if (t.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(t);
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas minhaLista = new ListaTarefas();

        minhaLista.adicionarTarefa("Atualizar páginas");
        minhaLista.adicionarTarefa("Anotações");
        minhaLista.adicionarTarefa("Cadastro no site");
        minhaLista.adicionarTarefa("Apresentar resultado");
        System.out.println("Existem " + minhaLista.obterNumeroTotalTarefas() + " no momento");

        minhaLista.removerTarefa("Anotações");

        System.out.println("Existem " + minhaLista.obterNumeroTotalTarefas() + " no momento");
        minhaLista.obterDescricoesTarefas();
    }

}
