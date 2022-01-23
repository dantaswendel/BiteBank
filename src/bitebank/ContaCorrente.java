package bitebank;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente (int agencia, int numero) { //Chamando contrutor da classe conta
		super(agencia,numero);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() *0.02;
	}
	
	
}
