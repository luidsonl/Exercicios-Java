package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int palpite;
		int valorCorreto = 10000;
		Scanner teclado = new Scanner (System.in);
		System.out.println("O exército de Leonidas de 300 lutou contra quantos persas?");
		System.out.println("Digite seu palpite");
		palpite = teclado.nextInt();
		while(palpite != valorCorreto) {
			if(palpite > valorCorreto) {
				System.out.println("Menos...");
			}
			else {
				System.out.println("Mais...");
			}
		/*String msg = palpite > valorCorreto ?"Menos...":"Mais...";
		System.out.println(msg);*/
		// Operador ternário
		System.out.println("Tente novamente");
		palpite = teclado.nextInt();
		}
	System.out.println("Você acertou!!");
	}

}
