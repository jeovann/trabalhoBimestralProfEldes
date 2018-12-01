package trabalhoOrdenacaoDados;

import java.util.Scanner;

public class EntradaComConcatenacao {
	   public static void main(String[] args) {
	        //Declaração de uma classe tipo Scanner para captar entradas de dados
	        Scanner entrada = new Scanner(System.in);
	        float valor = 0;//Criando uma variável do tipo float
	        System.out.println("Quanto custa algo em uma loja de R$ 1,99 ?");
	        valor = entrada.nextFloat();//Recebendo o valor 
	        System.out.println("Este é o valor nesta loja " + valor );
	    }
}