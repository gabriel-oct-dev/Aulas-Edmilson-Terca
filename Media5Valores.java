package JavaAulas;

import java.util.Scanner;

public class Media5Valores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int quantidade = 5;
		System.out.println("Digite 5 valores:");
		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Valor " + i + ": ");
			double valor = sc.nextDouble();
			soma += valor;
		}
		double media = soma / quantidade;
		System.out.println("A media dos valores e; " + media);
		sc.close();
	}
}
