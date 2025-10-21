package JavaAulas;
import java.util.Scanner;

public class CalculoRestSalario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do seu salario: ");
		double salario = sc.nextDouble();

		System.out.print("Digite o valor do aluguel: ");
		double aluguel = sc.nextDouble();

		System.out.print("Digite o valor da conta de luz: ");
		double luz = sc.nextDouble();

		System.out.print("Digite o valor da conta de agua: ");
		double agua = sc.nextDouble();

		System.out.print("Digite o valor da internet: ");
		double internet = sc.nextDouble();

		System.out.print("Digite o valor dos gastos com alimentação: ");
		double alimentacao = sc.nextDouble();


	double totalDespesas = aluguel + luz + agua + internet + alimentacao;
	double resto = salario - totalDespesas;

		System.out.println("O que vai sobrar do seu salário e: R$ " + resto);
		sc.close();
	}
}
