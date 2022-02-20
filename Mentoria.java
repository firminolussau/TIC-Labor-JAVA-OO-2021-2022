package br.com.dio.desafio.Bootcamp.Conteudos.Dev.Curso;

import java.time.LocalDate;
public class Mentoria extends Conteudos{

   private LocalDate data;

    @Override
    public double calcularxp() {
        return XP_PADRAO + 20d;

    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
