package uninter;

import java.util.Scanner;


public class Principal {
	static Moeda moeda;

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();
		Scanner teclado = new Scanner(System.in); // Implementa a função de capturar teclado
		
		int opcao; // Variavel de seleção da opção
		int tipoMoeda;
		double valorMoeda;
		int idSelecionado;
		
		
		System.out.println("Cofrinho de moedas - Luidson lima Santos - 4135933");
		System.out.println("Escolha uma das opções:");
		System.out.println("1 -- Adicionar moedas de diferentes valores e países em seu cofrinho");
		System.out.println("2 -- Remover moedas específicas do cofrinho");
		System.out.println("3 -- Listar todas as moedas que estão dentro do cofrinho");
		System.out.println("4 -- Calcular quanto dinheiro existe no cofrinho convertido para Real");
		System.out.println("0 -- Encerrar programa");
		
		opcao = teclado.nextInt(); // Recebe a opção desejada
		System.out.println("");
		
		while(opcao != 0) { // Cria o loop que exibe o menu
			
			switch(opcao) {
			
			case 1:
			System.out.println("Informe a moeda que deseja inserir:");
			System.out.println("Insira 1 para Real");
			System.out.println("Insira 2 para Dolar");
			System.out.println("Insira 3 para Euro");
			
			//Recebe a opção desejada
			tipoMoeda = teclado.nextInt();
			
			//Cria um validador enquanto a opção for inválida
			while (tipoMoeda < 1 || tipoMoeda > 3) {
				System.out.println("Opção inválida! Tente novamente");
				tipoMoeda = teclado.nextInt();
				}
			
			// Recebe o valor desejado
			System.out.println("Agora informe o valor da moeda:");
			valorMoeda = teclado.nextDouble();
			
			cofrinho.adicionarMoeda(valorMoeda, tipoMoeda);
			
			break;

			case 2:
				System.out.println("Informe o id da moeda que deseja excluir:");
				idSelecionado = teclado.nextInt();
				cofrinho.removerMoeda(idSelecionado);
				
				break;
			case 3:
				System.out.println("Exibindo moedas no cofrinho:");
				cofrinho.listarMoedas();
				
				break;
			case 4: 
				System.out.println("Exibindo falor total em reais:");
				cofrinho.totalEmReal();
				break;
			default:
				System.out.println("Opção inválida! Tente novamente...");
				break;
				
			}
			
			
			System.out.println("Escolha uma das opções:");
			System.out.println("1 -- Adicionar moedas de diferentes valores e países em seu cofrinho");
			System.out.println("2 -- Remover moedas específicas do cofrinho");
			System.out.println("3 -- Listar todas as moedas que estão dentro do cofrinho");
			System.out.println("4 -- Calcular quanto dinheiro existe no cofrinho convertido para Real");
			System.out.println("0 -- Encerrar programa");
			
			opcao = teclado.nextInt(); // Recebe a opção desejada
			System.out.println("");
		}
		teclado.close();
		System.out.println("Programa encerrado...");
		
	}
	
}
