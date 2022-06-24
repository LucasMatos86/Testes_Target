package Target;

import java.util.Scanner;

public class Teste4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] estados = { "SP", "RJ", "MG", "ES", "Outros" };
		double[] faturamento = new double[estados.length];
		double total = 0;

		for (int i = 0; i < estados.length; i++) {
			System.out.println("Faturamento do estado [ " + estados[i]+ " ]");
			faturamento[i] = in.nextDouble();
			total += faturamento[i];
		}
		System.out.println(total);
		for (int i = 0; i < estados.length; i++) {
			double porcento = ((faturamento[i]/total)*100);
			System.out.printf("Porcentagem de representacao de [" +estados[i]+" ] = %.4f%n", porcento);
		}
		

	}
}
