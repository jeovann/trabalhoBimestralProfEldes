package trabalhoOrdenacaoDados;

import java.util.Scanner;

public class Volume {
	public static void main(String[] args) {
        //Declarando os tipos de variáveis doubles
        double altura, comprimento, largura, volume;
        //Imprimindo as mensagens para receber os valores
        System.out.println("Digite o valor da altura: ");
        //Classe Scanner para receber os dados
        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextDouble();
        System.out.println("Digite o valor do comprimento: ");
        comprimento = entrada.nextDouble();
        System.out.println("Digite o valor da largura: ");
        largura = entrada.nextDouble();
        
        volume = comprimento * altura * largura;
        System.out.println("O volume da caixa é:  " + volume);
    }
}