import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {///inicio programa
    public static void main(String arg[]){//inicio classe main
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 28.0;
        int valorSolicitado = 0;

        
        System.out.println("\n Digite valor do Saque....");
                         valorSolicitado = scanner.nextInt();

 
        String resultado = saldo == valorSolicitado ? "Seu Saldo e 0"  : saldo <= valorSolicitado ?  "Saldo Insuficiente Seu saldo e...." + saldo : "Saque Realizado com Sucesso";
        System.out.println(resultado);

        //if(valorSolicitado < saldo){//inicio if
            //System.out.println("Saque Realizado com Sucesso");
 
        //}//fim do if

        ///else if (saldo == valorSolicitado  )//um else fica dentro do if, caso seja mais de um sai do if{}&& saldo == valorSolicitado
           // System.out.println("Seu Saldo final e 0");
       // else

            //System.out.println("\n Saldo Insuficiente Seu saldo e...." + saldo);

    }//fim clase main
}//fim programa
