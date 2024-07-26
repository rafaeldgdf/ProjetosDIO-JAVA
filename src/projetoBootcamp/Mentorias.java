package projetoBootcamp;


import java.time.LocalDate;


public class Mentorias extends Conteudo {
    private LocalDate data;
    
   
    public Mentorias(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
    public void obterInformacoes() {
        System.out.println("Mentoria: " + titulo + "\nDescrição: " + descricao + "\nData: " + data);
    }
}
