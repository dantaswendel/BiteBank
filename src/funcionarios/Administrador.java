package funcionarios;

public class Administrador extends Funcionario {

	
	private Autenticacao autenticador;

	public double getBonificacao() { // chama metodo da classe mae
		return 50;
	}

	public Administrador () {
		this.autenticador = new Autenticacao();
	}
	
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	}


