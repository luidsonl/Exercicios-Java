package uninter;


import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    int ID = 1;

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
    
    public void removerMoeda(int idSelecionado) {
    	
		boolean encontrado = false;
		for(Moeda moeda : listaMoedas) {
			
			if (moeda.ID == idSelecionado) {
				
				System.out.println("A seguinte moeda foi excluída com sucesso:");
				moeda.info();
				listaMoedas.remove(moeda);
				
				encontrado = true;
				
				break;
				
			}
		}
		if (encontrado == false) {
			System.out.println("ID não encontrado...");
			System.out.println();
		}
    }
    
	public void listarMoedas(){
		if (listaMoedas.size() == 0) {
			System.out.println("Desculpe, o cofrinho está vazio...");
		}
		for(Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}
	
	public void totalEmReal() {
		double valorTotal = 0;
		for(Moeda moeda : listaMoedas) {
			valorTotal += moeda.converterReal();
			System.out.println();
		}
		System.out.println("O valor total em reais é igual a: " + valorTotal);
	}
}