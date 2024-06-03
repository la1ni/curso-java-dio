package AgendaDeContatos;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>() {
        };
    }
    public void adicionarContato(String nome, Integer telefone){
        agenda.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agenda.isEmpty())
            agenda.remove(nome);
    }
    public void  exibirContatos(){
        System.out.println(agenda);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agenda.isEmpty())
            numeroPorNome = agenda.get(nome);
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos minhaAgenda = new AgendaContatos();

        minhaAgenda.adicionarContato("Luna", 319555322);
        minhaAgenda.adicionarContato("Paula", 319555422);
        minhaAgenda.adicionarContato("Gabi", 319555522);
        minhaAgenda.adicionarContato("Larissa", 319555122);
        minhaAgenda.adicionarContato("Clarice", 319555022);

        minhaAgenda.removerContato("Luna");
        minhaAgenda.exibirContatos();
        System.out.println(minhaAgenda.pesquisarPorNome("Paula"));
    }
}
