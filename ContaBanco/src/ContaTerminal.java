import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("\nDigite Numero da Agencia");
        int agencia = scanner.nextInt();

        System.out.println("\nDigite Numero da Conta");
        double conta = scanner.nextInt();
        
        System.out.println("\nDigite seu nome");
        String nome = scanner.next();
        
        System.out.println("\nDigite seu sobrenome");
        String sobrenome = scanner.next();

        double saldo = 237.48;
        
        

        
        //imprimindo os dados obtidos pelo cliente
        System.out.println("Ola, " + nome + " " + sobrenome);
        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agencia e: " + agencia);
        System.out.println("Sua conta e: " + conta);
        System.out.println("Seu Saldo e de: " + saldo);
               
        
    }
}
