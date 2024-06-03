package ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoDeConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoARemover = null;
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet)
                if (c.getCodigoConvite() == (codigoConvite)) {
                    convidadoARemover = c;
                    break;

                }
            convidadosSet.remove(convidadoARemover);
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }

    }
    public int contarConvidados() {
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoDeConvidados meuConjunto = new ConjuntoDeConvidados();
        meuConjunto.adicionarConvidado("Patricia", 12334);
        meuConjunto.adicionarConvidado("Aureliano", 12335);
        meuConjunto.adicionarConvidado("Jose", 12336);
        meuConjunto.adicionarConvidado("Pilar", 12337);
        System.out.println(meuConjunto.contarConvidados());
        meuConjunto.removerConvidadoPorCodigoConvite(12337);
        meuConjunto.exibirConvidados();

    }
}