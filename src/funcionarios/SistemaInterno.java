package funcionarios;

public class SistemaInterno {

	private int senha = 3241;
	
	public void autentica(Autenticavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso Concedido");
		}
		else {
			System.out.println("Acesso Negado");
		}
	}
	
	
}
