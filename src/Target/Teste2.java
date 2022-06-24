package Target;

import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Qual numero deseja encontrar?");
		n = in.nextInt();
		if (fibonacci(n) == true) {
			System.out.println("\nPERTENCE A SEQUENCIA");
		} else {
			System.out.println("\nNAO PERTENCE A SEQUENCIA");
		}
	}

	public static boolean fibonacci(int n) {
		int num1 = 1, num2 = 0;

		for (int i = 0; i < n; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.print(num1 + ", ");
			if (n == num1) {
				return true;

			}

		}
		return false;
	}
}
