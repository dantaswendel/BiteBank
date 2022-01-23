package bitebank;

public class TestaBanco {

	public static void main(String[] args) {

	ContaCorrente conta = new ContaCorrente(3486,3201);
	conta.deposita(1000);
	
	CalculadorDeImposto calc = new CalculadorDeImposto();
	calc.registra(conta);
	
		
	System.out.println(calc.getTotalImposto());
	}

	
}
