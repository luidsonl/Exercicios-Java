package uninter;

public abstract class Moeda {
	
	double valorMoeda;
	int ID;
	String nomeMoeda;

	public Moeda (double valorMoeda, int ID) {
		super();
		this.valorMoeda = valorMoeda;
		this.ID = ID;
	}
	
	public void info() {
		System.out.println("ID da moeda:" + ID);
		System.out.println("Nome da moeda: " + nomeMoeda);
		System.out.println("Valor da Moeda:" + valorMoeda);
		System.out.println("Valor em real:" + converterReal());
		System.out.println();
	}
	
	public double converterReal() {
		return 0;
	}
	

}