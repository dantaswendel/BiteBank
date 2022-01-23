package funcionarios;

public class Gerente  extends Funcionario {

public int senha;
private Autenticacao autenticador;


	public double getBonificacao() { // chama metodo da classe mae
		return super.getSalario() ;
	}

	public Gerente () {
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
