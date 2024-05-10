// SistemaMedida.java

// Modo condicional if/else

import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String sigla = "";

       System.out.println("Entre com uma Letra");
        sigla = scanner.next().toUpperCase();

            switch (sigla) {
                case "P":
                    System.out.println("A letra inserida e\t" +sigla+"\tPEQUENO");
                    break;
                
                case "M":
                    System.out.println("A letra inserida e\t" +sigla+"\tMEDIO");
                    break;
                
                case "G":
                    System.out.println("A letra inserida e\t" +sigla+"\tGRANDE");
                
                default:
                    System.out.println("A letra inserida e\t" +sigla+"\tINDEFINIDO");
                 
                
            }
        scanner.close();     
                        	
           
	}
 
}