package Target;

import java.util.Random;

public class Teste3 {
	public static void main(String[] args) {
		Random random = new Random();
		int a[] = new int[30];
		int maior = 0, menor = 100, cont = 0;
		double soma = 0;
		

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt();
			System.out.print(a[i] + ", ");

			soma = soma + a[i];
		}
		soma = soma / a.length;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maior) {
				maior = a[i];
			}
			if (a[i] < menor) {
				menor = a[i];
			}

			if (soma < a[i]) {
				cont++;
			}
		}
		System.out.println("\n");
		System.out.println("O menor e " + menor);
		System.out.println("O maior e " + maior);
		System.out.println("Dias com maior faturamento mensal " + cont);
	}
	
}
