import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {


		Scanner terminal = new Scanner(System.in);

        int parametroUm = 0;
        int parametroDois = 0;

		System.out.println("Digite o primeiro parâmetro"); 
            parametroUm = terminal.nextInt();
		

		System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();

			
		try {
			
			contar(parametroUm, parametroDois++);
		
		}catch (ParametrosInvalidosException e) {
			        System.out.println(e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
				
		if (parametroUm >= parametroDois) {
           throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro parametro");
        } 
		int Contagem = parametroDois - parametroUm;
            for(int i = 1; i <= Contagem; i++){
                System.out.println("Imprimindo o numero " + i);
            }
	}
}