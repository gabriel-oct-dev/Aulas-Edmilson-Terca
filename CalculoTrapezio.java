package JavaAulas;

import java.util.Scanner;

public class CalculoTrapezio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da base maior do trapezio: ");
		double baseMaior = sc.nextDouble();
		System.out.print("Digite o valor da base menor do trapezio: ");
		double baseMenor = sc.nextDouble();
		System.out.print("Digite o valor da altura do trapezio: ");
		double altura = sc.nextDouble();
		double area = ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("A area do trapezio e: " + area);
		sc.close();
	}
}
    
