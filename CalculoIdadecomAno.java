package JavaAulas;

import java.util.Scanner;

public class CalculoIdadecomAno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu ano de nascimento: :");
		int anoNascimento = sc.nextInt();
		int anoAtual = 2025; 
		int idade = anoAtual - anoNascimento;
		System.out.println("Voce tem: " + idade + " anos.");
		sc.close();
	}
}