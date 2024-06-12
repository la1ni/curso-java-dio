package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;


    public LocalDate getCargaHoraria() {
        return data;
    }

    public void setData(LocalDate cargaHoraria) {
        this.data = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 200;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data =" + data +
                '}';
    }
}
