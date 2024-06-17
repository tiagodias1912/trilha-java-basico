package Desafio;

public class Teste {

	public static void main(String[] args) {
		
		Cliente tiago = new Cliente();
		tiago.setNome("Tiago");
		tiago.setCpf(7535);
		
		
		IConta cc = new ContaCorrente(tiago);
		IConta cp = new ContaPoupanca(tiago);
		
		
		cc.depositar(100);			
		cc.trasnferir(50, cp);
		
		
		cp.depositar(200);
		cp.trasnferir(75, cc);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
