package trabalhoOrdenacaoDados;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
	       //Declaração de uma classe tipo Scanner para captar entradas de dados
	       Scanner entrada = new Scanner(System.in);
	       int idade; //Criando uma variável do tipo inteiro
	        System.out.println("Digite sua idade: ");
	        idade = entrada.nextInt();//Recebendo o valor
	        System.out.println("Sua idade é: " + idade);
	    }
}