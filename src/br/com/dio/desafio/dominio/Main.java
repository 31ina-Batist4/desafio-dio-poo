package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java.");
       curso1.setDescricao("Descrição: curso Java.");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso JavaScript.");
       curso2.setDescricao("Descrição: curso JavaScript.");
       curso2.setCargaHoraria(10);

       Mentoria mentoria1 = new Mentoria();
       mentoria1.setTitulo("Mentoria de Java.");
       mentoria1.setDescricao("Descrição: mentoria java");
       mentoria1.setData(LocalDate.now());

    /*    System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Elina");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("*---------------------*");
        System.out.println(dev.getNome() +": conteudos inscritos "+ dev.getConteudosInscrito());
        System.out.println("*---------------------*");
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println(dev.getNome() +": conteudos concluidos "+ dev.getConteudosConcluidos());
        System.out.println(dev.getNome() +": conteudos inscritos "+ dev.getConteudosInscrito());
        System.out.println("XP: "+ dev.calcularTotalXp());
        Dev dev1 = new Dev();
        System.out.println("*---------------------*");
        dev1.setNome("Janaiana");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome() + ": conteudos inscritos "+ dev1.getConteudosInscrito());
        System.out.println("*---------------------*");
        dev1.progredir();
        System.out.println(dev1.getNome() + ": conteudos concluidos"+ dev1.getConteudosConcluidos());
        System.out.println(dev1.getNome() + ": conteudos inscritos "+ dev1.getConteudosInscrito());
        System.out.println("XP: "+ dev1.calcularTotalXp());
        System.out.println("*---------------------*");

        System.out.println("Quantidade de Devs inscritos no bootcamp: "+ bootcamp.getNome()+
                "\n" +bootcamp.getDevsInscritos().size());
    }
}
