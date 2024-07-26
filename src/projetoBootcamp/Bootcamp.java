package projetoBootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Conteudo> conteudos;
    private List<Devs> devsInscritos;

    public Bootcamp(String nome, String descricao, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.conteudos = new ArrayList<>();
        this.devsInscritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void inscreverDev(Devs dev) {
        devsInscritos.add(dev);
        for (Conteudo conteudo : conteudos) {
            dev.inscreverConteudo(conteudo);
        }
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public List<Devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void listarDevsInscritos() {
        System.out.println("Devs inscritos no Bootcamp " + nome + ":");
        for (Devs dev : devsInscritos) {
            System.out.println("- " + dev.getNome() + " (" + dev.getEmail() + ")");
        }
    }
}
