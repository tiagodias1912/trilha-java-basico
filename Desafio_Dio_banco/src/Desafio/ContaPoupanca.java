package Desafio;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Simples Conferencia Conta Poupanca===");
		super.imprimirInfosComuns();
		
	}

	
}


