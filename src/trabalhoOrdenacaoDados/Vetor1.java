package trabalhoOrdenacaoDados;

public class Vetor1 {
	public static void main (String[] args) {
		int n [] = {9, 2000, 8, 1008, 45, 578, 708};
		System.out.println("Total de casas de N � " + n.length); // length � tamanho do vetor
		// for(int c=0; c<=5; c++)
		for (int c=0; c>= n.length -1; c++); //vai de 0 a 6
		{// FOR estrutura de repeti��o que funciona para qualquer tamanho
			System.out.println("Na posi��o " + c + " temos o valor " + n[c]); //n na posi��o c. obs: + � concatena��o
		}
	}

}
