package br.com.dio.desafio.Bootcamp.Conteudos.Dev.Curso;

    import java.util.LinkedHashSet;
    import java.util.Objects;
    import java.util.Optional;
    import java.util.Set;

    public class Dev {
        private String nome;
        private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
       private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();

       public void InscreverBootcamp (Bootcamp bootcamp){
           this.conteudosInscritos.addAll(bootcamp.getConteudos());
           bootcamp.getDevsInscricao().add(this);

       }

       public void progredir (){
           Optional<Conteudos> conteudos = this.conteudosInscritos.stream().findFirst();
           if (conteudos.isPresent()){
               this.conteudosConcluidos.add(conteudos.get());
               this.conteudosInscritos.remove(conteudos.get());
           }else{
               System.err.println("Você não está inscrito em nenhum conteúdo");
           }

       }

       public double calcularTotalXp(){
           return this.conteudosConcluidos.stream().mapToDouble(conteudos -> conteudos.calcularxp() ).sum();
       }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Set<Conteudos> getConteudosInscritos() {
            return conteudosInscritos;
        }

        public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
            this.conteudosInscritos = conteudosInscritos;
        }

        public Set<Conteudos> getConteudosConcluidos() {
            return conteudosConcluidos;
        }

        public void setConteudosConcluidos(Set<Conteudos> conteudosConcluidos) {
            this.conteudosConcluidos = conteudosConcluidos;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dev dev = (Dev) o;
            return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
        }
    }
