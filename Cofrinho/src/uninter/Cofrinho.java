package uninter;


import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    int ID = 1; // Cria a variável ID, importante para controlar as moedas do cofrinho

    // Implementa o método adicionarMoeda
    public void adicionarMoeda(Double valor, int tipo){
    	if (tipo == 1) {
        	Moeda moeda = new Real(valor, ID);
            listaMoedas.add(moeda);
    	}
    	else if (tipo == 2) {
        	Moeda moeda = new Dolar(valor, ID);
            listaMoedas.add(moeda);
    	}
    	else if (tipo == 3) {
        	Moeda moeda = new Euro(valor, ID);
            listaMoedas.add(moeda);
    	}
        ID ++;
        System.out.println("Moeda adicionada.");
    }
    
    //Implementa o método removerMoeda
    public void removerMoeda(int idSelecionado) {
    	
		boolean encontrado = false; // cria a variável que indicará se o id foi encontrado
		
		for(Moeda moeda : listaMoedas) {
			if (moeda.ID == idSelecionado) {
				System.out.println("A seguinte moeda foi excluída com sucesso:");
				moeda.info(); // chama o método info
				listaMoedas.remove(moeda); // remove a moeda da lista
				encontrado = true;
				break;
				
			}
		}
		// Retorna mensagem caso a moeda desejada não seja encontrada
		if (encontrado == false) {
			System.out.println("ID não encontrado...");
			System.out.println();
		}
    }
    
	public void listarMoedas(){
		if (listaMoedas.size() == 0) {
			System.out.println("Desculpe, o cofrinho está vazio...");
		}
		// cria um loop que chamará o método info() de todas as moedas da lista
		for(Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}
	
	public void totalEmReal() {
		
		double valorTotal = 0; // cria variável que irá acumular o valor da soma das moedas
		
		for(Moeda moeda : listaMoedas) {
			valorTotal += moeda.converterReal(); // adiciona o valor da moeda em reais ao valor total
		}
		System.out.println(valorTotal + " R$");
	}
}