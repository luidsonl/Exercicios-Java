package uninter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		int quantidade;
		String item;
		
		System.out.println("Reversor de palavras");
		System.out.println("Informe a quantidade itens da lista");
		quantidade = teclado.nextInt();
		
		for(int i=0; i < quantidade; i++) {
			System.out.println("Infrome um nome");
			item = teclado.next();
			lista.add(item);
		}
		System.out.println("A ordem inversa é:");
		/*
		for(int i = lista.size()-1; i >=0; i--) {
			System.out.println(lista.get(i));
		}*/
		System.out.println("Ordem normal");
		System.out.println(lista);
		Collections.reverse(lista);
		System.out.println("Ordem reversa");
		System.out.println(lista);
	}

}
