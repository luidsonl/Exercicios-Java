package uninter;

public class Real extends Moeda{
	
	public Real(double valorMoeda, int ID) {
		super(valorMoeda, ID);
		nomeMoeda = "Real"; // Define o nome da moeda para Real
	}
	
	// modifica o método converterReal da classe mãe
	@Override
	public double converterReal() {
		return valorMoeda;
		
	}
}