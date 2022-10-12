package uninter;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o seu peso");
		int peso = teclado.nextInt();
		System.out.println("Informe sua altura");
		double altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O valor do seu IMC é: %.2f", imc);
	}

}
