package br.com.dio.desafio.Bootcamp.Conteudos.Dev.Curso;

import java.time.LocalDate;

public class main {
    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("DESCRIÇÃO CURSO JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("DESCRIÇÃO CURSO JS");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

      System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Describes Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFirmino = new Dev();
        devFirmino.setNome("Firmino");
        devFirmino.InscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Firmino" + devFirmino.getConteudosInscritos());
        devFirmino.progredir();
        devFirmino.progredir();
        System.out.println("-");
        System.out.println("conteúdos concluidos Firmino" + devFirmino.getConteudosConcluidos());
        System.out.println("XP:" + devFirmino.calcularTotalXp());
        System.out.println("-------------------");

        Dev devEtiandro = new Dev();
        devEtiandro.setNome("Etiandro");
        devEtiandro.InscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Etiandro" + devEtiandro.getConteudosInscritos());
        devEtiandro.progredir();
        devEtiandro.progredir();
        devEtiandro.progredir();
        System.out.println("-");
        System.out.println("conteúdos concluidos Etiandro" + devEtiandro.getConteudosConcluidos());
        System.out.println("XP:" + devEtiandro.calcularTotalXp());
    }
}
