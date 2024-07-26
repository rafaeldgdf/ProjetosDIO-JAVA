package projetoBootcamp;

import java.util.ArrayList;
import java.util.List;

public class Devs {
    private String nome;
    private String email;
    private List<Conteudo> conteudosInscritos;

    public Devs(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.conteudosInscritos = new ArrayList<>();
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public void inscreverConteudo(Conteudo conteudo) {
        conteudosInscritos.add(conteudo);
    }

    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
}
