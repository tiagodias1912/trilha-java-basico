import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        
      
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
         
		      System.out.println("\t(1) Depositar");
		      System.out.println("\t(2) Sacar");
		      System.out.println("\t(3) Consultar Saldo");
		      System.out.println("\t(4) Sair do Sistema");

            int opcao = scanner.nextInt(); 
            try{
                opcao = Integer.parseInt(scanner.next("\n\tEscolha uma opcao:"));
            }
            catch(NumberFormatException nfe){
                System.out.println("Deve ser um valor inteiro - press <ENTER>");
                scanner.next("");
                
                continue;
            }    
        }


        
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
 
            }
        
    }

