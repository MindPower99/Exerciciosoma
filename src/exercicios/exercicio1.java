package exercicios;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = 0 , n2 = 0, result = 0;
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Digite o próximo número: ");
		n2 = input.nextInt();
		result = n1 + n2;
		System.out.printf("O resultado da soma é: " +result);
	}

}
