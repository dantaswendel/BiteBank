package bitebank_composto;

public class TestaBanco {

	public static void main(String[] args) {

		Cliente wendel = new Cliente(); // Criando Cliente
		wendel.nome = "Wendel Ferreira";
		wendel.cpf = "583.497.385-02";
		wendel.profissao = "Designer";

		Cliente andreza = new Cliente(); 
		andreza.nome = "Andreza Santos";
		andreza.cpf = "583.497.385-02";
		andreza.profissao = "Desenvolvedora";
		
		Conta contaWendel = new Conta(); // Criando Conta
		contaWendel.titular = wendel; //Atribuindo cliente a conta

		Conta contaAndreza = new Conta(); 
		contaAndreza.titular = andreza; 
	
	}

}
