package uninter;

public class Euro extends Moeda {

	public Euro(double valorMoeda, int ID) {
		super(valorMoeda, ID);
		nomeMoeda = "Euro";	// Define o nome da moeda para Euro
		}
	
	// modifica o método converterReal da classe mãe
	@Override
	public double converterReal() {
		return valorMoeda* 5.4;
		
	}


}
