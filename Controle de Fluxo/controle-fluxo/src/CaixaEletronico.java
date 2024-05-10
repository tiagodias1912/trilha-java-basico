public class CaixaEletronico {///inicio programa
    public static void main(String arg[]){//inicio classe main
        double saldo = 25.0;
        double valorSolicitado = 25.0;

        if(valorSolicitado < saldo){//inicio if
                saldo = saldo - valorSolicitado;
                    System.out.println("\n Valor Solicitado...." + valorSolicitado);

        }//fim do if 
        else if (saldo >= valorSolicitado && saldo < valorSolicitado )
            System.out.println("não sei que msg impirmi");
    else

            System.out.println("\n Saldo Insuficiente Seu saldo e...." + saldo);

    }//fim clase main
}//fim programa
