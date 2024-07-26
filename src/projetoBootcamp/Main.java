package projetoBootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      
        Cursos cursoJava = new Cursos("Java", "Curso de Java básico", 40);
        Cursos cursoPython = new Cursos("Python", "Programação em Python", 196);
        
        Mentorias mentoriaJava = new Mentorias("Mentoria Java", "Mentoria sobre práticas avançadas em Java", LocalDate.now());
        Mentorias mentoriaPython = new Mentorias("Mentoria Python", "Mentoria com profissionais experientes na linguagem Python", LocalDate.now());
        
        Devs dev1 = new Devs("Rafael", "rafael123@hotmail.com");
        Devs dev2 = new Devs("Pedro", " pedro123@gmail.com");
        Devs dev3 = new Devs("Maria Clara", "maria.clara@gmails.com");
        Devs dev4 = new Devs( "Vitor", "vitorvitor@bol.com");
        Devs dev5 = new Devs( "Augusto", "augusto.vitor@bol.com");
      
        Bootcamp bootcamp = new Bootcamp("Santander Java Developer", "Descrição do Bootcamp Java", LocalDate.now(), LocalDate.now().plusDays(45));
        Bootcamp bootcamp2 = new Bootcamp("Vivo Python", "Curso de formação em Python pela Vivo", LocalDate.now(), LocalDate.now().plusDays(90));
        
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(mentoriaJava);
        bootcamp2.adicionarConteudo(cursoPython);
        bootcamp2.adicionarConteudo(mentoriaPython);

 
        bootcamp.inscreverDev(dev1);
        bootcamp.inscreverDev(dev2);
        bootcamp.inscreverDev(dev3);
        cursoJava.obterInformacoes();
        mentoriaJava.obterInformacoes();
        bootcamp.listarDevsInscritos();
        System.out.println();
        System.out.println();
        System.out.println();
        bootcamp2.inscreverDev(dev4);
        bootcamp2.inscreverDev(dev5);
        cursoPython.obterInformacoes();
        mentoriaPython.obterInformacoes();
        bootcamp2.listarDevsInscritos();
        
        
    }
}
