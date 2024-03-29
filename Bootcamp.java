package br.com.dio.desafio.Bootcamp.Conteudos.Dev.Curso;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
    public class Bootcamp {
        private String nome;
        private String descricao;
        private final LocalDate dataInicial = LocalDate.now();
        private final LocalDate dataFinal = dataInicial.plusDays(45);

        private Set<Dev> devsInscricao = new HashSet<>();
        private Set<Conteudos> conteudos = new LinkedHashSet<>();

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public LocalDate getDataInicial() {
            return dataInicial;
        }

        public LocalDate getDataFinal() {
            return dataFinal;
        }

        public Set<Dev> getDevsInscricao() {
            return devsInscricao;
        }

        public void setDevsInscricao(Set<Dev> devsInscricao) {
            this.devsInscricao = devsInscricao;
        }

        public Set<Conteudos> getConteudos() {
            return conteudos;
        }

        public void setConteudos(Set<Conteudos> conteudos) {
            this.conteudos = conteudos;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bootcamp bootcamp = (Bootcamp) o;
            return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscricao, bootcamp.devsInscricao) && Objects.equals(conteudos, bootcamp.conteudos);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscricao, conteudos);
        }
    }
