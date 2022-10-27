package uninter;

public class Dolar extends Moeda {
	
	public Dolar(double valorMoeda, int ID) {
		super(valorMoeda, ID);
		nomeMoeda = "Dolar"; // Define o nome da moeda para Dolar
	}
	
	// modifica o método converterReal da classe mãe
	@Override
	public double converterReal() {
		return valorMoeda* 5.3;
		
	}

}
