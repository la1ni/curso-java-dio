package AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(agendaEventosMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        //descobrindo data atual
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>();
        //ordenação do map por data
        for (Map.Entry<LocalDate, Evento> entry : agendaEventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                // Se a data é igual à data atual ou é depois da data atual
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                // o método entrySet retorna objetos do tipo map.entry contendo ligação entre chave e valor
            }
            if (proximoEvento != null) {
                System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
            } else {
                System.out.println("Não há eventos futuros na agenda.");
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 3, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 1, 12), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
