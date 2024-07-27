package subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}

	public static void gravarCliente(String nome, String cep, String cidade, String estado) {	
		System.out.println("cliente salvo");	
		System.out.println(nome + cep + cidade + estado);
		
	}

}
