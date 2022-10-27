package uninter;

public abstract class Moeda {
	
	double valorMoeda;
	int ID;
	String nomeMoeda;
	
	// Cria construtor para a classe moeda
	public Moeda (double valorMoeda, int ID) {
		super();
		this.valorMoeda = valorMoeda;
		this.ID = ID;
	}
	
	// Implementa o método info() que será herdado pelas classes filhas
	public void info() {
		System.out.println("ID da moeda:" + ID);
		System.out.println("Nome da moeda: " + nomeMoeda);
		System.out.println("Valor da Moeda:" + valorMoeda);
		System.out.println("Valor em real:" + converterReal());
		System.out.println();
	}
	
	// Implementa o método converterReal()
	public double converterReal() {
		return 0;
	}
	

}