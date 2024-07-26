package projetoBootcamp;

public class Cursos extends Conteudo {
	
	private int cargaHoraria;	

    public Cursos(String titulo, String descricao) {
		super(titulo, descricao);
	}


	public Cursos(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public void obterInformacoes() {
        System.out.println("Curso: " + titulo + "\nDescrição: " + descricao + "\nCarga Horária: " + cargaHoraria + " horas");
    }	

}
