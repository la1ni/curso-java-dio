import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso meuCurso = new Curso();
        meuCurso.setTitulo("Javascript");
        meuCurso.setDescricao("curso de javascript");
        meuCurso.setCargaHoraria(15);

        Mentoria minhaMentoria = new Mentoria();
        minhaMentoria.setTitulo("Mercado de trabalho");
        minhaMentoria.setDescricao("mentoria sobre o mercado de trabalho");
        minhaMentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Javascript");
        bootcamp.setDescricao("do zero ao javascript");
        bootcamp.getConteudos().add(minhaMentoria);
        bootcamp.getConteudos().add(meuCurso);

        Dev dev1 = new Dev();
        dev1.setNome("Ana");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Gabi");
        dev2.inscreverBootcamp(bootcamp);
    }
}
