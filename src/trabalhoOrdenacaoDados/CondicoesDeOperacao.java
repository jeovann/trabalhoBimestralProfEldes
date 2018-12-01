package trabalhoOrdenacaoDados;

import java.util.Scanner;

public class CondicoesDeOperacao {
	public static void main(String[] args) {
        //Criando variáveis do tipo double
        double n1, n2, soma, divisao, multiplicacao, subtracao;
        //Criando variável do tipo inteiro
        int operacao;
        //Recebendo os valores
        Scanner nomeObjtValor = new Scanner(System.in);
        System.out.println("Minha calculadora Java");
        
        System.out.println("Digite um número:");
        n1 = nomeObjtValor.nextDouble();
        System.out.println("Digite outro número:");
        n2 = nomeObjtValor.nextDouble();
        
        System.out.println("Que operação deseja realizar"
                + " 1: Somar"
                + " 2: Subtrair"
                + " 3: Multiplicar"
                + " 4: Divisão");
        
        System.out.println("Escolhar um número: ");
        operacao = nomeObjtValor.nextInt();
        //Criando uma condição para o caso acima
        if(operacao == 1){
            soma = n1 + n2;
            System.out.println("A soma é " + soma);
        }else if(operacao == 2){
            subtracao = n1 - n2;
            System.out.println("A subtracao é " + subtracao);
        }else if(operacao == 3){
            multiplicacao = n1 * n2;
            System.out.println("A multiplicacao é " + multiplicacao);
        }else if(operacao == 4){
            divisao = n1 / n2;
            System.out.println("A divisão é " + divisao);
        }else{
            System.out.println("Operação inválida!");
        }
    }
}